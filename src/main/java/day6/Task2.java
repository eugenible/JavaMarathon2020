package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane su = new Airplane("Russia", 2010, 30, 15000);
        su.setYear(2020);
        su.setLength(25);
        su.fillUp(300);
        su.fillUp(50);
        su.info();
    }
}