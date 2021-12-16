package e_Enum;

/**
 * 
 * 열거체에 숫자를 지정해줄 수 있습니다. 단점은, 하나만 특별하게 지정 할 수는 없고, 모두 지정하던가, 모두 지정하지 않아야 합니다.
 *
 */

public class C_Numbering {
	enum RainbowNo {
		RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
	    private final int value;
	    RainbowNo(int value) {
	    	this.value = value;
	    }
	    public int getValue() {
	    	return value;
	    }
	}
	
	public static void main(String[] args) {
        RainbowNo[] arr = RainbowNo.values();
        for (RainbowNo rb : arr) {
            System.out.println(rb + "\torder : " + rb.ordinal() + "\tvalue : " +rb.getValue());
        }
	}
}
