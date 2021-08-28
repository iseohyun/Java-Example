package Quiz;
/*
 * 95, 75, 85, 100, 50을 오름차순 정렬하시오
 * 
 */

public class T01Q17_Sort {
	public static void main(String[] args) {
		int [] E = {/*?????*/95, 75, 85, 100, 50};
		for(int i=0; i<4; i++) {
			for(int j=0; j<4-i; j++) {
				if(/*****/E[j] > E[j+1]) {
					int temp = /*****/ E[j];
					/*****/ E[j] = E[j+1];
					E[j+1] = temp;
				}
			}
		}
		for(int i=0; i<5; i++)
			System.out.print(E[i]+" ");
	}
}
