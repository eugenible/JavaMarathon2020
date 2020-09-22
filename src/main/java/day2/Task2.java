package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner goRead = new Scanner(System.in);
        int a = goRead.nextInt();
        int b = goRead.nextInt();
        if (a == b || a > b) System.out.println("Не-а, так нельзя");
        else {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
