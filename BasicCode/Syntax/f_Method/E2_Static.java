package f_Method;

/**
 * 
 * E_Local과 똑같은 예제지만 결과가 다릅니다.
 * val이 함수 바깥에 있기 때문에 함수의 생애와 상관없이, 항상 살아 있는 변수이기 때문에, 변경사항이 유지되는 것을 확인 할 수
 * 있습니다.
 *
 */

public class E2_Static {
    public static void main(String[] args) {
        func1();
        func1();
        func1();
        func1();
        func1();
    }

    static int val = 1;

    static void func1() {
        val++;
        System.out.println("전역 변수 : " + val);
    }
}