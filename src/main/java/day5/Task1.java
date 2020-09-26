package day5;

public class Task1 {
    public static void main(String[] args) {
        Car tachka = new Car();
        tachka.setYear(2020);
        tachka.setColor("Green");
        tachka.setModel("BMX X5");

        System.out.println("Год выпуска машины: " + tachka.getYear());
        System.out.println("Цвет машины: " + tachka.getColor());
        System.out.println("Моодель машины: " + tachka.getModel());

    }
}


