package d_Math;

public class QuizAns {
    public static void main(String[] args) {
        double b = 4;
        double c = 6;
        double h;
        double degree = 50;

        // Quiz: getH() 함수 의뢰.
        // 삼각형 ABC의 각 변을 a, b, c라고 하자.
        // 각 A는 변 b와 c사이에 있는 각이라고 할 때,
        // 각A, 변b, 변c를 이용하여, 높이h(선분 BC에서 점A까지의 거리)를 구하는 함수를 만드시오.
        h = getH(b, c, degree);

        System.out.println("높이 : " + h);
    }

    static double getH(double b, double c, double degree) {
        // radian = Math.sin(40.0/180.0 * Math.PI); // (40도= 40/180PI이다.)

        // 코사인 법칙 a^2 = b^2 + c^2 - 2bccosA
        double a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - 2 * b * c * Math.cos(Math.toRadians(degree)));

        // 넓이 S = 1/2*sinA*bc = 1/2 ah
        // h = sinA*bc/a
        double ret = Math.sin(Math.toRadians(degree)) * b * c / a;

        // 정담 확인 (https://www.desmos.com/calculator/p83wgrjq95)
        // 높이 : 3.9980580410364297
        return ret;
    }
}