package b_String;

public class E2_Capacity {
    public static void main(String[] args) {
        StringBuffer str01 = new StringBuffer();
        StringBuffer str02 = new StringBuffer("Java");
        System.out.println(str01.capacity());
        System.out.println(str02.capacity());
    }
}