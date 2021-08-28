package Quiz;

public class Y20T01Q11_for {
	public static int[] makeArray(int n) {
		int[] t = new int[n];
		for(int i = 0; i < n; i++) {
			t[i]= i;
		}
		return t;
	}
	
	public static void main(String[] args) {
		int[] a = makeArray(4) ;
		for(int i = 0; i <a.length; i++)
			System.out.print(a[i] + " ");
	}
}