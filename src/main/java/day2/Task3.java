package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner goRead = new Scanner(System.in);
        int a = goRead.nextInt();
        int b = goRead.nextInt();
        if (a == b || a > b) System.out.println("Не-а, так не пойдет");
        else {
            while ((a + 1) != b) {
                if ((a + 1) % 5 == 0 && ((a + 1) % 10 != 0)) {
                    System.out.print((a + 1) + " ");
                }
                a++;
            }
        }
    }
}
