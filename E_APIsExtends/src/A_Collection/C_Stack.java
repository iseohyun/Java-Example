package A_Collection;

import java.util.Stack;

public class C_Stack {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("������");
		System.out.println(st.peek() + st + st.size());
		st.push("ȭ����");
		System.out.println(st.peek() + st + st.size());
		st.push("������");
		System.out.println(st.peek() + st + st.size());
		st.push("�����");
		System.out.println(st.peek() + st + st.size());
		st.push("�ݿ���");
		System.out.println(st.peek() + st + st.size());
		System.out.println(st.pop());
		System.out.println(st.peek() + st + st.size());
		System.out.println(st.pop());
		System.out.println(st.peek() + st + st.size());
		System.out.println("to ������ : " + st.search("������"));
		System.out.println("to ȭ���� : " + st.search("ȭ����"));
		System.out.println("to �ݿ��� : " + st.search("�ݿ���"));
	}
}
