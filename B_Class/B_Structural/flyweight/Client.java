package flyweight;

import java.awt.Color;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;

/**
 *	���� : https://ko.wikipedia.org/wiki/%ED%94%8C%EB%9D%BC%EC%9D%B4%EC%9B%A8%EC%9D%B4%ED%8A%B8_%ED%8C%A8%ED%84%B4
 * @author Seohyun Jung
 *
 *		�ö��̿���Ʈ ���� : �޸� �Ҵ�� ��ġ�� �κ��� �ִ��� Ȱ���ϱ� ���� ����Դϴ�.
 *
 *		�ڵ� ���� :
 *			�޸𸮿� ����� ��Ʈ�� (��Ʈ��, ũ��, ��, Ư¡)�� �̿��Ͽ� �ϳ��� �ڵ�(�ؽ��ڵ�)�� ��ȯ�ϰ�, �װ��� ���̺�� ������ �ִٰ�,
 *			���� ������ ��������
 *
 */

@SuppressWarnings("unused")
public class Client {
	public static void main(String[] args) {
		EnumSet<FontEffect> set = EnumSet.noneOf(FontEffect.class);

		System.out.println("> �ű� �Ҵ�");
		FontData fd = FontData.create(13, "����", Color.black, FontEffect.BOLD);

		System.out.println("> ������ �ٸ��� �Ҵ�");
		fd = FontData.create(10, "����", Color.black, FontEffect.BOLD);

		System.out.println("> �۲� �ٸ��� �Ҵ�");
		fd = FontData.create(13, "����", Color.black, FontEffect.BOLD);

		System.out.println("> ���� �ٸ��� �Ҵ�");
		fd = FontData.create(13, "����", Color.blue, FontEffect.BOLD);

		System.out.println("> Ư�� �߰� �Ҵ�");
		fd = FontData.create(13, "����", Color.black, FontEffect.BOLD, FontEffect.ITALIC);

		System.out.println("> ������ �����ϰ� �Ҵ�");
		fd = FontData.create(13, "����", Color.black, FontEffect.BOLD);

		System.out.println("> ���� �����ϰ� �Ҵ�");
		fd = FontData.create(13, "����", Color.black, FontEffect.BOLD);
	}
}

enum FontEffect {
	BOLD, ITALIC, SUPERSCRIPT, SUBSCRIPT, STRIKETHROUGH
}

@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
final class FontData {
	private static final WeakHashMap<FontData, WeakReference<FontData>> flyweightData = new WeakHashMap<FontData, WeakReference<FontData>>();
	private final int pointSize;
	private final String fontFace;
	private final Color color;
	private final Set<FontEffect> effects;

	private FontData(int pointSize, String fontFace, Color color, EnumSet<FontEffect> effects) {
		this.pointSize = pointSize;
		this.fontFace = fontFace;
		this.color = color;
		this.effects = Collections.unmodifiableSet(effects);
	}

	public static FontData create(int pointSize, String fontFace, Color color, FontEffect... effects) {
		EnumSet<FontEffect> effectsSet = EnumSet.noneOf(FontEffect.class);
		for (FontEffect fontEffect : effects) {
			effectsSet.add(fontEffect);
		}
		FontData data = new FontData(pointSize, fontFace, color, effectsSet);
		if (!flyweightData.containsKey(data)) {
			System.out.println("�޸� �Ҵ�");
			flyweightData.put(data, new WeakReference(data));
		} else {
			System.out.println("�̹� ����� �޸� ���");
		}
		return flyweightData.get(data).get();
	}

	@Override
	public boolean equals(Object obj) {
		if (this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return pointSize + effects.hashCode() + fontFace.hashCode() + color.hashCode(); // ���� Ȯ���� overflow������ ���� �� �ֽ��ϴ�.
																						// ������ ��, �缳�谡 �ʿ��� ���� �½��ϴ�.
		// return pointSize + effects.hashCode() + fontFace.hashCode(); // ������ ���� ��������
		// ��, �ٸ� ����?
	}
}