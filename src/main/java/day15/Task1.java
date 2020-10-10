package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File doc1 = new File("src/main/resources/shoes.csv");
        File doc2 = new File("src/main/resources/missing_shoes.txt");
        PrintWriter writeIt = new PrintWriter(doc2);
        Scanner readIt = new Scanner(doc1);
        while(readIt.hasNextLine()) {
            String str = readIt.nextLine();
            String[] shoes = str.split(";");
            if (Integer.parseInt(shoes[2]) == 0) {
                writeIt.println(str.replace(";", ","));
            }
        }
        writeIt.close();
    }
}
