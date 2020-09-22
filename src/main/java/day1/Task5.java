package day1;

public class Task5 {
    public static void main(String[] args) {
        for (int a = 1980; a <= 2020 ; a += 4) {
           // System.out.println("Олимпиада " + a + " года");
            System.out.printf("Олимпиада %d года\n", a);
            // если использовать решение System.out.printf("Олимпиада %d года\n", a);,
            // то тест ругается, что "org.opentest4j.AssertionFailedError: Не верное количество строк со словом JAVA".
            // решение работает, - тест на меня почему быканул? :D
        }
    }
}
