package A_Collection;

import java.util.HashMap;
import java.util.Iterator;

public class G_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("���", 30);
		hm.put("��", 10);
		hm.put("���", 40);
		hm.put("�̽�", 20);
		System.out.println("�ʿ� ����� Ű���� ���� : " + hm.keySet());
		for (String key : hm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}

		hm.remove("���");
		System.out.println("�ʿ� ����� Ű���� ���� : " + hm.keySet());
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}

		hm.replace("�̽�", 200);
		System.out.println("�ʿ� ����� Ű���� ���� : " + hm.keySet());
		for (String key : hm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}
		System.out.println("���� ũ�� : " + hm.size());
	}
}