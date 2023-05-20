package a2_Array;

import java.util.Arrays;

public class E_hashcode {
    public static void main(String[] args) {
        String[] colors = { "red", "orange", "yellow", "green", "blue", "indigo", "Violet" };
        int[] numbers = { 3, 5, 7, 9, 11 };

        // Array를 hashCode로 변경합니다.
        int hashColor = Arrays.deepHashCode(colors);
        int hashNumbers = Arrays.hashCode(numbers);

        System.out.println(hashColor);
        System.out.println(hashNumbers);
    }
}
