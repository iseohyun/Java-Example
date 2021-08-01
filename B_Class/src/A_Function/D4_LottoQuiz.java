package A_Function;

import java.util.Random;

public class D4_LottoQuiz {
	static int[] lotto = new int[6];
	public static void main(String argv[]) {
		genLotto();		// 로또 번호를 생성한다.
		sort();			// 낮은 번호부터 정렬한다.
		printLotto();	// 로또 번호를 프린터한다. 
	}

	// Quiz 1. 로또 번호를 생성해서, 순서대로 정렬 한 후, 프린터하는 함수를 생성한다.
	// Quiz 2. 해당 함수를 5번 출력한다.
	
	static void genLotto() {
		Random rand = new Random();

		lotto[0] = rand.nextInt(45) + 1;
		for(int i = 1; i < 6 ; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	static void sort() {
		for(int i = 0; i < 6 ; i++) {
			for(int j = i; j < 6 ; j++) {
				if(lotto[i] > lotto[j]) {
					lotto[i] ^= lotto[j];
					lotto[j] ^= lotto[i];
					lotto[i] ^= lotto[j];
				}
			}
		}
	}
	static void printLotto() {
		for(int i = 0; i < 6 ; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
	}
}
