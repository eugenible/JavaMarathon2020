package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] goodOne = {7, 14, -59, 994, 40, -14, -9, 88, 777777};
        System.out.println(recursionSum(goodOne));
    }

    public static int recursionSum(int[] a) {

        if (a.length == 1) {
            return a[0];
        }

        int[] b = Arrays.copyOf(a, a.length - 1);
        return a[a.length - 1] + recursionSum(b);
    }
}
