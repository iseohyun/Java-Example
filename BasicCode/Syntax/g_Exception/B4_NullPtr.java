package g_Exception;

@SuppressWarnings("null")
public class B4_NullPtr {
    public static void main(String[] str) {
        String ptr = null;
        try {
            boolean b = ptr.equals("String") ? true : false;
            if (b)
                System.out.println("String");
        } catch (Exception e) {
            System.out.println("오류가 발견되었습니다.");
            e.printStackTrace();
        }
    }
}