package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] massa = new int[12][8];
        int max = 0, sum, num = 0;
        for (int i = 0; i < massa.length; i++) {
            sum = 0;
            for (int t = 0; t < massa[t].length; t++) {
                massa[i][t] = (int) (Math.random() * 51);
                sum += massa[i][t];
            }
            if (sum >= max) {
                max = sum;
                num = i;
            }
        }
        System.out.println("Индекс строки с наибольшей суммой элементов: " + num + "\nСумма элементов в этой строке равна: " + max);
    }
}
