package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 500; i++) {
            if ((i > 30) && (i < 300)) {
                continue;
            }
            if (i % 2 == 0) {
                nums.add(i);
            }
        }
        System.out.println(nums);
    }
}
