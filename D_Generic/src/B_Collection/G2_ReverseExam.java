package B_Collection;

import java.util.Iterator;
import java.util.TreeMap;

public class G2_ReverseExam {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(30, "���");
		tm.put(10, "��");
		tm.put(40, "���");
		tm.put(20, "�̽�");
		
		System.out.println("�ʿ� ����� Ű���� ���� : " + tm.keySet());
		for (Integer key : tm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, tm.get(key)));
		}
		
		tm.remove(40);
		System.out.println("�ʿ� ����� Ű���� ���� : " + tm.keySet());
		Iterator<Integer> keys = tm.keySet().iterator();
		while (keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, tm.get(key)));
		}
				
		tm.replace(20, "twenty");
		System.out.println("�ʿ� ����� Ű���� ���� : " + tm.keySet());
		for (Integer key : tm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, tm.get(key)));
		}
		System.out.println("���� ũ�� : " + tm.size());
	}
}
