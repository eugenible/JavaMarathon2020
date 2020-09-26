package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int big = 0, one = 0, even = 0, odd = 0, sum = 0;
        Scanner scanIt = new Scanner(System.in);
        int[] massa = new int[scanIt.nextInt()];
        for (int i = 0; i < massa.length; i++) {
            massa[i] = (int) (Math.random() * 11);
            if (massa[i] > 8) big++;
            if (massa[i] == 1) one++;
            if (massa[i] % 2 == 0) even++;
            else odd++;
            sum += massa[i];
        }
        System.out.print("Сформированный массив: " + Arrays.toString(massa) + "\nКоличество чисел больше 8: " + big + "\nКоличество чисел, равных 1: " + one +
                "\nКоличество четных чисел: " + even + "\nКоличество нечетных чисел: " + odd + "\nСумма элементов массива: " + sum);
    }
}
