package day12.task4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membs1 = new ArrayList<>();
        membs1.add("Сергей Зверев");
        membs1.add("Валерий Меладзе");

        List<String> membs2 = new ArrayList<>();
        membs2.add("Евгений Третьяков");
        membs2.add("Анастасия Черкасова");

        MusicBand banda1 = new MusicBand("Клещи", 1999, membs1);
        MusicBand banda2 = new MusicBand("Сибиряки", 2020, membs2);
        banda1.printMembers();
        banda2.printMembers();
        MusicBand.transferMembers(banda1, banda2);
        System.out.println("\nПроизвели слияния групп\n");
        banda1.printMembers();
        banda2.printMembers();
    }
}
