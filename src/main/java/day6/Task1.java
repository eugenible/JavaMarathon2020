package day6;
import java.util.Random;


public class Task1 {
    public static void main(String[] args) {
        Car tachka1 = new Car();
        tachka1.setYear(2008);
        tachka1.info();
        System.out.println(tachka1.yearDifference(2019));

        Motorbike motik1 = new Motorbike("DirtyX", "White", 2015);
        motik1.info();
        System.out.println(motik1.yearDifference(2017));
    }
}