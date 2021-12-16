package f_Function;

/**
 * 
 * main도 함수입니다.
 * main함수에 인자를 전달할 수 있는 방법이 없기 때문에 툴의 도움을 받아야 합니다.
 * 
 * (최소 1번 실행하면 H_main이 생성되어 있습니다.)
 * H_main.java에서 우클릭 => Properties => Run/Debug Setting => H_main => Arguments탭 => Program Arguments
 *
 */

public class H_Main {
	public static void main(String[] args) {
		for(String arg : args)
			System.out.println(arg);
	}
}
