package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String res = "";
        for (int i = 0; i < 20001; i++) {
            res += i + " ";
        }
        System.out.println(res);
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения программы 1 способом составило " + (finish-start) + " миллисекунд");

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < 20001; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
        long finish2 = System.currentTimeMillis();
        System.out.println("Время выполнения программы 2 способом составило " + (finish2-start2) + " миллисекунд");
    }
}
