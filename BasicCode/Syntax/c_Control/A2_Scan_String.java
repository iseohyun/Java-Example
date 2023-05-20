package c_Control;

import java.util.Scanner;

/**
 * 
 * 문자열을 입력받는 예제입니다.
 * 숫자도 알고보면 문자열입니다.
 * 만약 숫자가 아니고 문자열이 입력되면, 시스템은 에러가 납니다.
 * 에러를 방어하는 방법은 이후에 나옵니다. (exception)
 * 
 */

public class A2_Scan_String {
    private static Scanner scan;

    public static void main(String[] args) {
        String str;
        scan = new Scanner(System.in);
        System.out.print("입력해 주세요 : ");
        str = scan.next();
        System.out.println("입력한 단어 : " + str);
        System.out.println("숫자로 변환 x 2 : " + Integer.parseInt(str) * 2);
        System.out.println("소수로 변환 ÷ 2 : " + Double.parseDouble(str) / 2);
    }
}

// 실습과제 1: 문자를 입력해 봅니다.
// 실습과제 2: 숫자를 입력해 봅니다.
