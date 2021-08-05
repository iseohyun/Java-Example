package D_Boxing;

public class C_Compare {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(20);
        Integer num3 = new Integer(10);
        
        System.out.println(num1 < num2);
        System.out.println(num1 == num3);
		System.out.println(num1.equals(num3));
	}
}
