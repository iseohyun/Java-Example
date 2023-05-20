package g_Exception;

public class C1_Throw {
    public static void main(String[] args) {
        try {
            handlingException();
        } catch (Exception e) {
            System.out.println("난가?!");
        }
    }

    static void handlingException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("너였냐!");
        }
    }
}