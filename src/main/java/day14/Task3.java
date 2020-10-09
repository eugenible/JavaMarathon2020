package day14;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
        File doc = new File("people.txt");
        System.out.println(Person.parseFileToObjList(doc));
    }
}
