package c_Boxing;

public class B_Unboxing {
    public static void main(String[] args) {
        Integer num1 = 7;
        Integer num2 = 3;

        int int1 = num1.intValue();
        int int2 = num2.intValue();

        System.out.println(num1 + num2);
        System.out.println(int1 - int2);
        System.out.println(num1 * int2);
    }
}