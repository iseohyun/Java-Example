package f_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class D_Queue {
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<String>();

//		ArrayDeque<String> qu = new ArrayDeque<String>();
		qu.add("����");
		System.out.println(qu.peek() + qu);
		qu.add("��Ȳ");
		System.out.println(qu.peek() + qu);
		qu.add("���");
		System.out.println(qu.peek() + qu);
		qu.add("�ʷ�");
		System.out.println(qu.peek() + qu);
		qu.add("�Ķ�");
		System.out.println(qu.peek() + qu);
		System.out.println("Remove : " + qu.remove());
		System.out.println(qu.peek() + qu);
		System.out.println("Poll : " + qu.poll());
		System.out.println(qu.peek() + qu);
		System.out.println("Poll : " + qu.poll());
		System.out.println(qu.peek() + qu);
	}
}