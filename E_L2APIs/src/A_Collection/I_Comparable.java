package A_Collection;
class A implements Comparable<A>{
	int idx;
	String name;

	A(int idx, String name){
		this.idx = idx;
		this.name = name;
	}
	
	void show() {
		System.out.println(idx + ":" + name);
	}
	public int compareTo(A o) {
		if(o.idx == idx) {
			System.out.println("같음");
			return 1;
		}else{
			System.out.println("다름");
			return 0;
		}
	} 
}
public class I_Comparable {
	public static void main(String[] args) {
		A cus01 = new A(1, "정서현");
		A cus02 = new A(2, "김범수");
		A cus03 = new A(1, "박정현");
		cus01.show();
		cus02.show();
		cus03.show();
		cus01.compareTo(cus02);
		cus01.compareTo(cus03);
	}
}
