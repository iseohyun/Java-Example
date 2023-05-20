package c_Control;

/**
 * 
 * coutinue문을 만나면, 반복문의 이후 처리내용을 무시하고, 조건문을 수행합니다.
 *
 */

public class E1_Continue {
    public static void main(String[] args) {
        int i = 1;
        while (i++ < 9999) {
            if (i == 5) { // 5이면 다음 단계(while)로 넘어갑니다.
                continue;
            }
            System.out.println(i + ">");
            if (i % 5 == 0) { // 5의 배수이면 중지합니다.
                break;
            }
        }
    }
}

// 실습과제 : continue구문을 주석 처리하고, 동작을 비교하세요.