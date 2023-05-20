package b_Operation;

/**
 *
 * 전위 연산과 후위연산을 이해하기 위한 예제 입니다.
 *
 */

public class C_plusplus {
    public static void main(String[] args) {
        int num = 100;

        System.out.println("01 : " + num++); // 100
        System.out.println("02 : " + num); // 101 <- 후위: 적용시점
        System.out.println("03 : " + ++num); // 102 <- 전위: 즉시
        System.out.println("04 : " + num); // 102
        System.out.println("05 : " + num--); // 102
        System.out.println("06 : " + num); // 101 <- 후위: 적용시점
        System.out.println("07 : " + --num); // 100 <- 전위: 즉시
        System.out.println("08 : " + num); // 100
    }
}