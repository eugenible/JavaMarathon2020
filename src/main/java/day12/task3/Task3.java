package day12.task3;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Task3 {
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> youngBands = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() <= 2000) {
                youngBands.add(band);
            }
        }
        return youngBands;
    }

    public static void main(String[] args) {
        MusicBand banda1 = new MusicBand("Foster the People", 2009);
        MusicBand banda2 = new MusicBand("New Politics", 2009);
        MusicBand banda3 = new MusicBand("alt-J", 2007);
        MusicBand banda4 = new MusicBand("Буерак", 2014);
        MusicBand banda5 = new MusicBand("Queen", 1970);
        MusicBand banda6 = new MusicBand("Иванушки International", 1995);
        MusicBand banda7 = new MusicBand("Нервы", 2010);
        MusicBand banda8 = new MusicBand("Альянс", 1980);
        MusicBand banda9 = new MusicBand("Blur", 1988);
        MusicBand banda10 = new MusicBand("Nirvana", 1987);

        List<MusicBand> spisok = new ArrayList<>();
        spisok.add(banda1);
        spisok.add(banda2);
        spisok.add(banda3);
        spisok.add(banda4);
        spisok.add(banda5);
        spisok.add(banda6);
        spisok.add(banda7);
        spisok.add(banda8);
        spisok.add(banda9);
        spisok.add(banda10);

        Collections.shuffle(spisok);
        for (MusicBand band : spisok) {
            System.out.println(band.getInfo());
        }

        System.out.println("\nИспользовали метод\n");

        List<MusicBand> youngBands = groupsAfter2000(spisok);
        for (MusicBand band : youngBands) {
            System.out.println(band.getInfo());
        }
    }
}


