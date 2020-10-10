package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File doc1 = new File("file1.txt");
        File doc2 = new File("file2.txt");

        try {
            boolean isDoc1 = doc1.createNewFile();
            boolean isDoc2 = doc2.createNewFile();
            PrintWriter writeIt = new PrintWriter(doc1);

            for (int i = 0; i < 1000; i++) {
                writeIt.print((int) (Math.random() * 101) + " ");
            }

            writeIt.close(); // ЗАКРЫВАЕМ ПОТОК, ЧТОБЫ ПОТОК СКАННЕРА УВИДЕЛ ИЗМЕНЕНИЯ !!!!!!!!!!!!

            Scanner readIt = new Scanner(doc1);

            String[] nums = readIt.nextLine().trim().split(" ");

            readIt.close();

            int counter = 0;
            int sum = 0;

            writeIt = new PrintWriter(doc2);
            for (String num : nums) {
                counter++;
                sum += Integer.parseInt(num);

                if (counter == 20) {
                    writeIt.print((double) sum / 20 + " ");
                    counter = 0;
                    sum = 0;
                }
            }
            writeIt.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        printResult(doc2);

    }

    public static void printResult(File file) throws FileNotFoundException {
        double sum = 0;
        Scanner readIt = new Scanner(file);
        String[] elems = readIt.nextLine().trim().split(" ");
        for (String elem : elems) {
            sum += Double.parseDouble(elem);
        }
        readIt.close();
        System.out.println((int) sum);
    }
}
