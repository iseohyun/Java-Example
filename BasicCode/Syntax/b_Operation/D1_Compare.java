package b_Operation;

/**
 *
 * And, OR, XOR, NOT은 컴퓨터 연산에 있어서 가장 중요한 연산입니다.
 * 각 연산에 대한 결과는 truth table(진리표)라고 하고, 반드시 암기해야 합니다.
 * 
 * 결과물에 대한 연산을 논리연산, bit단위로 세부적인 연산을 비트 연산입니다.
 * 여기서는 논리연산만 다룹니다. 논리연산은 &&, ||, (없음), ! 으로 표현합니다.
 * 
 */
public class D1_Compare {
    public static void main(String[] args) {
        int num = 7;

        System.out.println("1 : " + (num < 5)); // false
        System.out.println("2 : " + (num > 5)); // true
        System.out.println("3 : " + !(num > 5)); // false
        System.out.println("4 : " + ((num < 5) && (num > 5))); // false (and) true = false
        System.out.println("5 : " + ((num < 5) || (num > 5))); // false (or) true = true
    }
}

// 실습과제 : 5를 입력하고, 결과를 해석해봅니다. [1, 2만 확인합니다.]
// 실습과제 : 코드를 크다(>)를 크거나 같다(>=), 작다(<)를 작거나 같다(<=)로 수정하고, 5를 입력해봅니다. [1, 2만
// 확인합니다.]
// 실습과제 : 3과 7을 각각 입력해보고, 결과를 비교해봅니다. [1, 2만 확인합니다.]
// 실습과제 : 항상 [4 : false][5 : true]가 출력되는 이유는 무엇입니까?
