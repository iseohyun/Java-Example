package B_Class;
class Arr{
	int a = 0;
	char c = 'a';
}

public class F_Array {
	public static void main (String [] args) {
		Arr[] array1 = new Arr[5];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = new Arr();
			array1[i].a = i * 2;
			array1[i].c = (char)('A' + i);
		}
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println("[ " + array1[i].a + " ] " + array1[i].c);
		}
	}
}
