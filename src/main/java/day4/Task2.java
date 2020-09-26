package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] massa = new int[100];
        for (int i = 0; i < massa.length; i++) {
            massa[i] = (int) (Math.random() * 10001);
        }
        int max = massa[0], min = massa[0], naNol = 0, sum = 0;
        for (int elem : massa) {
            if (elem > max) max = elem;
            if (elem < min) min = elem;
            if (elem % 10 == 0) {
                naNol++;
                sum += elem;
            }
        }
        System.out.println("Наибольший элемент массива: " + max + "\nНаименьший элемент массива: " + min +
                "\nКоличество элементов массива, оканчивающихся на 0: " + naNol + "\nСумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
