package E_Enum;

public class A_Enum {
	enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
	
	public static void main(String[] args) {
		System.out.println(Rainbow.GREEN);
		System.out.println("==========");

        Rainbow red = Rainbow.valueOf("RED");
        System.out.println(red);
		System.out.println("==========");
		
        int idx = Rainbow.YELLOW.ordinal();
        System.out.println(idx);
		System.out.println("==========");
        
        String str = Rainbow.VIOLET.name();
        System.out.println(str);
	}
}
