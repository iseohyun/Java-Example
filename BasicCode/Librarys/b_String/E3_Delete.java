package b_String;

public class E3_Delete {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java Class");
        System.out.println("실행 전 : " + str);
        System.out.println(str.deleteCharAt(5));
        System.out.println(str.delete(2, 7));
        System.out.println(str.insert(1, "xxx"));
        System.out.println(str.reverse());
        System.out.println("실행 후 : " + str);
    }
}