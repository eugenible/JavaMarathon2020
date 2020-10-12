package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(-3463));
    }

    public static int count7(int a) {
        a = Math.abs(a);

        if (a == 0) {
            return 0;
        }

        if ((a - 7) % 10 == 0) {
            return 1 + count7(a / 10);
        } else {
            return count7(a / 10);
        }
    }
}

