package f_Collection;

import java.util.Stack;

public class C_Stack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("월요일");
        System.out.println(st.peek() + st + st.size());
        st.push("화요일");
        System.out.println(st.peek() + st + st.size());
        st.push("수요일");
        System.out.println(st.peek() + st + st.size());
        st.push("목요일");
        System.out.println(st.peek() + st + st.size());
        st.push("금요일");
        System.out.println(st.peek() + st + st.size());
        System.out.println(st.pop());
        System.out.println(st.peek() + st + st.size());
        System.out.println(st.pop());
        System.out.println(st.peek() + st + st.size());
        System.out.println("to 월요일 : " + st.search("월요일"));
        System.out.println("to 화요일 : " + st.search("화요일"));
        System.out.println("to 금요일 : " + st.search("금요일"));
    }
}