package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        File doc = new File("people.txt");
        System.out.println(parseFileToStringList(doc));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> info = new ArrayList<>();

        try {
            Scanner readNow = new Scanner(file);
            while (readNow.hasNextLine()) {
                String a = readNow.nextLine();
                if (Integer.parseInt(a.split(" ")[1]) >= 0) {
                    info.add(a);
                } else {
                    throw new NegativeAgeException("Некорректный входной файл");
                }
            }
            readNow.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
