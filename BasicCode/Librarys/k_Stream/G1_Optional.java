package k_Stream;

import java.util.NoSuchElementException;
import java.util.Optional;

public class G1_Optional {
    public static void main(String[] args) {
        String str = "Java", strNull = null;
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println(opt.get()); // java를 출력합니다.

        opt = Optional.ofNullable(strNull);
        try {
            // Null pointer Exception이 발생하지 않습니다.
            System.out.println(opt.get());
        } catch (NoSuchElementException e) {
            System.out.println("출력할 값이 없습니다.");
        }
        System.out.println("=====");
        try {
            opt = Optional.of(strNull);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}