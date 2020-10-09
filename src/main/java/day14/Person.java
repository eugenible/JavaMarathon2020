package day14;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return ("{name=" + "'"+ this.getName() +"', year=" + this.getAge() + "}");
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        try {
            Scanner readNow = new Scanner(file);

            while(readNow.hasNextLine()) {
                String str = readNow.nextLine();
                String[] elems = str.split(" ");

                if (Integer.parseInt(elems[1]) < 0) {
                    throw new NegativeAgeException("Некорректный входной файл");
                }
                people.add(new Person(elems[0], Integer.parseInt(elems[1])));
            }
            return people;

        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }
}
