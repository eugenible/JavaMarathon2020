package day8;

public class Airplane {
    private String mfr;
    private int year, length, weight, fuel;

    public Airplane(String mfr, int year, int length, int weight){
        this.mfr = mfr;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel(){
        return this.fuel;
    }

    public void info() {
        System.out.print("Изготовитель: " + this.mfr + ", год выпуска: " + this.year + ", длина: " + this.length +
                " м, вес: " + this.weight + " кг, количество топлива в баке: " + this.fuel + " л");
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString(){
        return ("Изготовитель: " + this.mfr + ", год выпуска: " + this.year + ", длина: " + this.length +
                " м, вес: " + this.weight + " кг, количество топлива в баке: " + this.fuel + " л");
    }
}