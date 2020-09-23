package day3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner readNow = new Scanner(System.in);
        boolean a = true;
        while (a) {
            String city = readNow.nextLine();
            switch (city) {
                case ("Москва"):
                case ("Владивосток"):
                case ("Ростов"):
                    System.out.println("Россия");
                    break;
                case ("Рим"):
                case ("Милан"):
                case ("Турин"):
                    System.out.println("Италия");
                    break;
                case ("Ливерпуль"):
                case ("Манчестер"):
                case ("Лондон"):
                    System.out.println("Англия");
                    break;
                case ("Берлин"):
                case ("Мюнхен"):
                case ("Кёльн"):
                    System.out.println("Германия");
                    break;
                case ("Stop"):
                    a = false;
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
