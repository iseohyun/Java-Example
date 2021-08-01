package E_Enum;
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

public class C_Numbering {
	public static void main(String[] args) {
        RainbowNo[] arr = RainbowNo.values();
        for (RainbowNo rb : arr) {
            System.out.println(rb + "\torder : " + rb.ordinal() + "\tvalue : " +rb.getValue());
        }
	}
}
