package g_Exception;

public class B3_ArrayIdxOoB {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        try {
            array1[4] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("오류가 발견되었습니다.");
            e.printStackTrace();
        }
    }
}