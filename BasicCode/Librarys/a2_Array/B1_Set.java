package a2_Array;

import java.util.Arrays;

public class B1_Set {
  public static void main(String[] args) {
    String[] array1 = new String[10];

    // 지정한 내용으로 모든 데이터를 초기화 합니다.
    Arrays.fill(array1, "text");
    System.out.println(Arrays.asList(array1));

    // 모든 데이터를 초기화 합니다. 초기화에 indexing을 할 수 있습니다.
    Arrays.setAll(array1, (value) -> {
      return "Num." + value;
    });
    System.out.println(Arrays.asList(array1));
  }
}
