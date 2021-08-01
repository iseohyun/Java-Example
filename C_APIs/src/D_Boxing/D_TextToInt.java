package D_Boxing;

public class D_TextToInt {
	public static void main(String[] args) {
		String num = "1234";
		System.out.println(num + 1);
		
		Integer i = new Integer(Integer.parseInt(num));
		System.out.println(i + 1);
		
		System.out.println(i.toBinaryString(i));
		System.out.println(i.toHexString(i).toUpperCase());
		System.out.println(i.toOctalString(i));
	}
}
