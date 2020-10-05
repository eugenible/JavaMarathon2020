package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist1 = new MusicArtist("Виталий Цаль", 28);
        MusicArtist artist2 = new MusicArtist("Вика Ред", 22);
        List<MusicArtist> membs1 = new ArrayList<>();
        membs1.add(artist1);
        membs1.add(artist2);

        MusicArtist artist3 = new MusicArtist("Евгений Третьяков", 23);
        MusicArtist artist4 = new MusicArtist("Анастаися Черкасова", 23);
        List<MusicArtist> membs2 = new ArrayList<>();
        membs2.add(artist3);
        membs2.add(artist4);

        MusicBand banda1 = new MusicBand("Воры Сердечек", 2017, membs1);
        MusicBand banda2 = new MusicBand("Любители Бигмаков", 2017, membs2);

        banda1.printMembers();
        banda2.printMembers();
        MusicBand.transferMembers(banda1, banda2);
        System.out.println("\nПроизвели слияния групп\n");
        banda1.printMembers();
        banda2.printMembers();
    }
}
