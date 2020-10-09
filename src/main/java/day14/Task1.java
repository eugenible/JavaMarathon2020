package day14;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        File doc = new File("textFile");
        System.out.println("Сумма чисел в файле " + doc.getPath() + " равняется " + printSumDigits(doc));
    }

    public static int printSumDigits(File file) {
        try {
            int sum = 0;
            Scanner readNow = new Scanner(file);
            String[] line = readNow.nextLine().split(" ");
            if (line.length != 10) {
                throw new ElemsNot10Exception("Некорректный входной файл");
            }
            for (String str : line) {
                sum += Integer.parseInt(str);
            }
            return sum;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ElemsNot10Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
