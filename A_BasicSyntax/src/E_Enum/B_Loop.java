package E_Enum;

/**
 * 
 * �迭�� ���������� ����ü�� for���� ����� �� �ֽ��ϴ�.
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
