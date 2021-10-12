package flyweight;

import java.awt.Color;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;

/**
 *	원본 : https://ko.wikipedia.org/wiki/%ED%94%8C%EB%9D%BC%EC%9D%B4%EC%9B%A8%EC%9D%B4%ED%8A%B8_%ED%8C%A8%ED%84%B4
 * @author Seohyun Jung
 *
 *		플라이웨이트 패턴 : 메모리 할당시 겹치는 부분을 최대한 활용하기 위한 기법입니다.
 *
 *		코드 설명 :
 *			메모리에 적재될 폰트를 (폰트명, 크기, 색, 특징)을 이용하여 하나의 코드(해쉬코드)로 변환하고, 그것을 테이블로 가지고 있다가,
 *			만약 동일한 형식으로
 *
 */

@SuppressWarnings("unused")
public class Client {
	public static void main(String[] args) {
		EnumSet<FontEffect> set = EnumSet.noneOf(FontEffect.class);

		System.out.println("> 신규 할당");
		FontData fd = FontData.create(13, "굴림", Color.black, FontEffect.BOLD);

		System.out.println("> 사이즈 다르게 할당");
		fd = FontData.create(10, "굴림", Color.black, FontEffect.BOLD);

		System.out.println("> 글꼴 다르게 할당");
		fd = FontData.create(13, "돋움", Color.black, FontEffect.BOLD);

		System.out.println("> 색상 다르게 할당");
		fd = FontData.create(13, "굴림", Color.blue, FontEffect.BOLD);

		System.out.println("> 특성 추가 할당");
		fd = FontData.create(13, "굴림", Color.black, FontEffect.BOLD, FontEffect.ITALIC);

		System.out.println("> 원본과 동일하게 할당");
		fd = FontData.create(13, "굴림", Color.black, FontEffect.BOLD);

		System.out.println("> 돋움 동일하게 할당");
		fd = FontData.create(13, "돋움", Color.black, FontEffect.BOLD);
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
			System.out.println("메모리 할당");
			flyweightData.put(data, new WeakReference(data));
		} else {
			System.out.println("이미 적재된 메모리 사용");
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
		return pointSize + effects.hashCode() + fontFace.hashCode() + color.hashCode(); // 낮은 확률로 overflow에러가 있을 수 있습니다.
																						// 예시일 뿐, 재설계가 필요한 것은 맞습니다.
		// return pointSize + effects.hashCode() + fontFace.hashCode(); // 다음과 같이 수정했을
		// 때, 다른 점은?
	}
}