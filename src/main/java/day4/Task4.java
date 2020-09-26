package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        int max = 0, sum, num = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10001);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            sum = nums[i] + nums[i + 1] + nums[i + 2];
            if (sum > max) {
                num = i;
                max = sum;
            }
        }
        System.out.println(num);
    }
}
