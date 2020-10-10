package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File doc = new File("textFile");
        printResult(doc);
    }

    public static void printResult(File file) {
        double sum = 0;
        int counter = 0;
        try {
            Scanner readIt = new Scanner(file);
            String[] a = readIt.nextLine().split(" ");
            for (String str : a) {
                sum += Double.parseDouble(str);
                counter++;
            }

            System.out.printf(sum/counter + " --> %.3f", sum/counter);
            readIt.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
