package E_Enum;

/**
 * 
 * 배열과 마찬가지로 열거체도 for문을 사용할 수 있습니다.
 *
 */

public class B_Loop {
	enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
	
	public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();
        for (Rainbow rb : arr) {
        	System.out.println(rb);
        }
	}
}
