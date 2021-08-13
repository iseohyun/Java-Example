package C_Exception;

public class B2_Typecast {
	public static void main(String[] args) {
		Object x = 0;
		try {
			System.out.println((String)x);
		}catch(ClassCastException e) {
			System.out.print("ClassCastException ¹ß»ý : ");
			System.out.println(x.toString());
		}
	}
}
