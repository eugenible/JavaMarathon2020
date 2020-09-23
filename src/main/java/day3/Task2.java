package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner readNow = new Scanner(System.in);;
        while (true) {
            double b = readNow.nextDouble();
            double c = readNow.nextDouble();
            if (c == 0) break;
            System.out.println(b/c);
        }
    }
}
