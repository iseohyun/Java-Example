/*
 * 코드를 수행하면 out of bounds 에러가 출력됩니다.
 * 
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at g_Exception.A1_NoException.main(A1_NoException.java:8)
 */
package g_Exception;

public class A1_NoException {
    public static void main(String[] args) {
        int[] list = new int[3];

        for (int i = 0; i < 4; i++)
            list[i] = i;
    }
}
