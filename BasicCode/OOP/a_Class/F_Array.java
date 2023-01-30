package a_Class;

public class F_Array {
  static class Class1 {
    static int seq = 1;
    int id = seq++;
    char ch = 'a';
  }

  public static void main(String[] args) {
    Class1[] arr1 = new Class1[5];

    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = new Class1();
      arr1[i].ch = (char) ('A' + i);
    }

    // for (Class1 arr : arr1) { // ※ 주의 : 이와 같은 방법은 동작하지 않습니다.
    // arr = new Class1();
    // }

    for (Class1 arr : arr1) {
      System.out.println("[ " + arr.id + " ] " + arr.ch);
    }
  }
}

// 실습 과제 : 5개를 10개로 변경해 봅니다.