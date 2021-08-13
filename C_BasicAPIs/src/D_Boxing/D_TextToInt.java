package D_Boxing;

public class D_TextToInt {
	public static void main(String[] args) {
		String num = "1234";
		System.out.println(num + 1);
		
		Integer i = Integer.parseInt(num);
		System.out.println(i + 1);
		
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i).toUpperCase());
		System.out.println(Integer.toOctalString(i));
	}
}
