package day12.task4;

import java.util.List;
import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    public List<String> getMembers(){
        return this.members;
    }

    public void printMembers() {
        System.out.println("Имена участников группы " + this.getName() + ":");
        for (int i = 0; i < this.members.size(); i++) {
            System.out.println(this.members.get(i));
        }
    }
}

