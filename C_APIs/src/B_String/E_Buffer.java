package B_String;

public class E_Buffer {
	public static void main(String[] args) {
		StringBuffer strBuf= new StringBuffer("Java");
		String str = "Java";
		System.out.println("str : " + str.concat(" Class"));
		System.out.println("BUF : " + strBuf.append("Class"));
		
		System.out.println("str : " + str);
		System.out.println("BUF : " + strBuf);
		
		strBuf.insert(4, " ");
		System.out.println("insert : " + strBuf);
		
		strBuf.deleteCharAt(6);
		System.out.println("delete@ : " + strBuf);
		
		strBuf.delete(2,7);
		System.out.println("delete : " + strBuf);
		
	}
}
