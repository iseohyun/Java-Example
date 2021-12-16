package Typeing;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TyppingTranning {
	static String []step1 = {
		"abstract"	,"boolean"	,"break"	,"byte"		,"case",
		"catch"		,"class"	,"continue"	,"default"	,"do",
		"double"	,"else"		,"extends"	,"false"	,"finally",
		"float"		,"for"		,"if"		,"implement","import",
		"instanceof","int"		,"interface","long"		,"native",
		"new"		,"null"		,"private"	,"protected","public",
		"return"	,"short"	,"static"	,"super"	,"switch",
		"synchronized","this"	,"throws"	,"true"		,"try",
		"void"		,"while"
	};
	static String []step2 = {
		"main"		,"String"	,"util"		,"input"	,"System",
		"out"		,"print"	,"println"	,"()"		,"{}",
		"[]"		,"next"		,"words"	,"include"	,"parents",
		"child"		,"students"	,
	};
	
	public static void main(String[] arg) throws IOException{
		
		int letter = 0; 	// 누적 글자 수
		long msec = 0;		// 누적 초(1/1000)
		int words = 0;		// 누적 단어 수
		int right = 0;		// 누적 정답
		int szQuiz = 0;		// Quiz모수 (출제 단어 수)
		int next = 0;		// 다음 단어
		String input;
		
		szQuiz = step1.length;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 사용자 커서 : 콘솔에 위치해 있는지 확인하는 작업
		System.out.println("준비되시면 a를 입력해주세요.");
		input = sc.next();
	
		for(int i = 0; i < 100; i++) {
			next = (next + rand.nextInt(szQuiz))%szQuiz;
			System.out.println("Q : " + step1[next]);
			input = sc.next();
			if(step1[next].compareTo(input) == 0) {
				right++;
			}else {
				if(input.compareTo(":q") == 0) {
					break;
				}
			}
			words++;
			System.out.println("정답률(출제수) : " + ((float)right/words)*100 + "%(" + words + ")");
		}
		System.out.println("종료합니다.");
		sc.close();
	}	
}
