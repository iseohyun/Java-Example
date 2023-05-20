package f_Method;

/**
 * 
 * 함수의 오버로딩(overloading)은 함수를 이해하는데 가장 중요한 개념입니다.
 * 컴퓨터는 함수를 이해할 때, 문자로 인식하지않고 숫자로 인식합니다.
 * 즉, 우리가 함수이름을 어떻게 작성하든 숫자로 변경해서 관리한다는 뜻입니다.
 * 그런데, 숫자로 변경하는 규칙에는 인자의 갯수와 종류도 영향을 줍니다.
 * 
 * 즉, int A(int a)와 int A(char a)는 전혀 다른 함수로 인식한다는 것이지요.
 * 또한, int A(int a)와 int A(int a, int b)도 서로 다른 함수로 인식합니다.
 * 
 * 하지만 우리는 똑같은 A함수로 인식하기 때문에, 이 점을 이용하여 가독성을 대폭상승시킵니다.
 * 우리가 기억할 수 있는 함수는 한계가 있습니다. 그래서 인자만 다르고 비슷한 기능을 하는 함수를 다 같은 이름으로 작성하면,
 * 정말 편리하게 함수들을 관리할 수 있습니다.
 *
 */

public class F1_Overloading {
    public static void main(String[] args) {
        int i = 1;
        float f = 2.1f;
        char c = 'a';
        double d = 4.1;

        printf(i);
        printf(f);
        printf(d);
        printf(c);

    }

    static void printf(int input) {
        System.out.println("Int :" + input);
    }

    static void printf(float input) {
        System.out.println("Float :" + input);
    }

    static void printf(double input) {
        System.out.println("Double :" + input);
    }

    static void printf(char input) {
        System.out.println("Char :" + input);
    }
}