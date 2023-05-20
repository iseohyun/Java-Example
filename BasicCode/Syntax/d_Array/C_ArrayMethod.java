package d_Array;

/**
 * 
 * 배열을 이용한 for문
 * for(선언문 : 배열){바디;}
 *
 * 예 : 
 *   int[] units;
 *   for(int unit : units) { 바디; }
 * 
 */

public class C_ArrayMethod {
    public static void main(String[] argv) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[10];
        int[] arr3;

        System.out.println("[Arr1]");
        for (int e : arr1)
            System.out.print(e + " ");

        // 배열을 복사 할 수 있습니다.
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println("\n[Arr2]");
        for (int e : arr2)
            System.out.print(e + " ");

        // 배열을 복제 할 수 있습니다.
        arr3 = (int[]) arr1.clone();
        System.out.println("\n[Arr3]");
        for (int e : arr3)
            System.out.print(e + " ");
    }
}

// 실습과제 : 10개짜리 배열을 만듭니다. 모든 변수에 0을 저장하고 0을 출력해봅니다.
// 실습과제 2: 10개짜리 배열을 만듭니다. 1부터 10까지 저장하고 0을 출력해봅니다.
// 실습과제 3: 10개짜리 배열을 만듭니다. 3의 배수를 순서대로 저장(3, 6, 9, 12,..)하고 출력합니다.