package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane sam1 = new Airplane("s7", 2010, 40, 20000);
        Airplane sam2 = new Airplane("aeroflot", 2011, 50, 15000);
        Airplane.compareAirplanes(sam1, sam2);
    }
}