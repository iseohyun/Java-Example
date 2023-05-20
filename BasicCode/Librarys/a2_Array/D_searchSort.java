package a2_Array;

import java.util.Arrays;

public class D_searchSort {
    public static void main(String[] args) {
        String[] colors = { "red", "orange", "yellow", "green", "blue", "indigo", "violet" };
        System.out.println(Arrays.asList(colors));

        // sort는 순서대로 정렬해줍니다. 순서를 정하기 위해서는 두개의 객체를 어떻게 비교할 것인지에 대한 아이디어를 전달해 주어야 합니다.
        Arrays.sort(colors, (o1, o2) -> {
            return o1.compareTo(o2);
        });
        System.out.println(Arrays.asList(colors));

        // search는 원하는 내용을 찾아줍니다. 찾기 위해서는 정렬이 되어 있어야 2진서치(binarySearch)가 정상적으로 동작합니다.
        int ret = Arrays.binarySearch(colors, "red", ((o1, o2) -> {
            return o1.compareTo(o2);
        }));
        System.out.println(ret);
    }
}
