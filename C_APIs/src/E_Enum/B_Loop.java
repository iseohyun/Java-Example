package E_Enum;

public class B_Loop {
	public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();
        for (Rainbow rb : arr) {
        	System.out.println(rb);
        }
	}
}
