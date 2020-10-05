package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Skoda");
        list.add("Toyota");
        list.add("Mercedez");
        list.add("Cadillac");
        list.add("VAZ");
        System.out.println(list); // как прописан метод выведения листа в строку?
        list.add(2, "Porsche");
        list.remove(0);
        System.out.println(list);
    }
}
