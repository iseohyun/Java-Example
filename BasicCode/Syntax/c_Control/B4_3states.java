package c_Control;

/**
 * 
 * 3항 연산자 문법 :
 * (조건)?참 인경우 수행할 내용:거짓인 경우 수행할 내용
 *
 */
public class B4_3states {
    public static void main(String[] args) {
        int a = 8, b = -8, max;

        max = (a > b) ? a : b;
        System.out.println("큰수 : " + max);
    }
}

// 실습과제 : 작은 수를 출력하도록 수정해 보세요.