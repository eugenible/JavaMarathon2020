package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike zver = new Motorbike(2020, "Black", "Yamaha");
        System.out.println("Год выпуска мотика: " + zver.getYear());
        System.out.println("Цвет мотика: " + zver.getColor());
        System.out.println("Модель мотика: " + zver.getModel());
    }
}
