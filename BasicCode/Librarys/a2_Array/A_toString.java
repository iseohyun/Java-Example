package a2_Array;

import java.util.Arrays;

public class A_toString {
  public static void main(String[] args) {
    int[] numbers = { 1,3,5,7,9 };
    String[] colors1 = { "red", "orange", "yellow", "green", "blue", "indigo", "Violet" };

    // 숫자를 텍스트 형태로 변경합니다.
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.asList(colors1));
  }
}
