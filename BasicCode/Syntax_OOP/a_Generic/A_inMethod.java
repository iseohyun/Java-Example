package a_Generic;

class A {
    String name;

    A(String name) {
        this.name = name;
    }
}

public class A_inMethod {
    public static void main(String[] args) {
        print(new A("foo"));
        print(new A("bar"));
    }

    static <T> void print(T n) {
        System.out.println("Print : " + ((A) n).name);
    }
}
