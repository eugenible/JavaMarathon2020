package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner readNow = new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i++) {
            double b = readNow.nextDouble();
            double c = readNow.nextDouble();
            if (c == 0) {
                System.out.println("Ты в школу не ходил? Не делай так больше");
                continue;
            }
            System.out.println(b/c);
        }
    }
}
