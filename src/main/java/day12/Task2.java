package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) {
                nums.add(i);
            }
        }

        for (int i = 300; i < 501; i++) {
            if (i % 2 == 0) {
                nums.add(i);
            }
        }
        System.out.println(nums);
    }
}
