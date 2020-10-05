package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.members.addAll(band1.members);
        band1.members.clear();
    }

    public int getYear() {
        return this.year;
    }

    public String getName() {
        return this.name;
    }

    public List<MusicArtist> getMembers(){
        return this.members;
    }

    public void printMembers() {
        System.out.println("Информация об участниках группы " + this.getName() + ":");
        for (int i = 0; i < this.members.size(); i++) {
            System.out.println(this.members.get(i));
        }
    }
}

