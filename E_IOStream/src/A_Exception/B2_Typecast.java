package A_Exception;

public class B2_Typecast {
	public static void main(String [] args) {
		Object x = new Integer(0);
		try {
			System.out.println((String)x);
		}catch(ClassCastException e) {
			System.out.print("ClassCastException �߻� : ");
			System.out.println(x.toString());
		}
	}
}
