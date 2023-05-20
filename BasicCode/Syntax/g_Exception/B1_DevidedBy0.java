package g_Exception;

public class B1_DevidedBy0 {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("오류가 발견되었습니다.");
            System.out.println(e.getMessage());
        }
    }
}