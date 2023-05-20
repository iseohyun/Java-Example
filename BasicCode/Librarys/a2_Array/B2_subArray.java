package a2_Array;

import java.util.Arrays;

public class B2_subArray {
    public static void main(String[] args) {
        String[] colors = { "red", "orange", "yellow", "green", "blue", "indigo", "Violet" };

        // copyOf는 index 1부터 newLength개의 리스트를 만듭니다. 만약 크기가 넘치면 Null로 채웁니다.
        String[] sub_colors1 = Arrays.copyOf(colors, 3);
        // copyOfRange는 from부터 to까지 리스트를 만듭니다. 만약 크기가 넘치면 Null로 채웁니다.
        String[] sub_colors2 = Arrays.copyOfRange(colors, 2, 7);

        System.out.println(Arrays.asList(colors));
        System.out.println(Arrays.asList(sub_colors1));
        System.out.println(Arrays.asList(sub_colors2));
    }
}
