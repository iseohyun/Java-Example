package a1_Object;

// 주의 : 반드시 Cloneable을 implements해야한다.
class Class1 implements Cloneable {
    String str;

    Class1(String str) {
        this.str = str;
    }

    public Object clone() {
        try {
            return (Class1) super.clone(); // 핵심
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class C_Clone implements Cloneable {
    public static void main(String[] args) {
        Class1 c1 = new Class1("First");
        System.out.println(c1 + " ===> " + c1.str);

        // 내용은 복사가 되지만 다른 클래스로 생성된다.
        Class1 c2 = (Class1) c1.clone();
        System.out.println(c2 + " ===> " + c2.str);

        // 내용을 바꾸면 전혀 다른 클래스가 된다.
        c2.str = "Second";
        System.out.println(c1 + " ===> " + c1.str);
        System.out.println(c2 + " ===> " + c2.str);
    }
}