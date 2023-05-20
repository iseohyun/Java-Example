package d_Math;

import java.util.Random;

public class C_Random {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        Random rand = new Random();
        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextInt(100));
    }
}