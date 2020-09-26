package day5;

public class Motorbike {
    private int year;
    private String color, model;
    Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear(){
        return this.year;
    }

    public String getColor(){
        return this.color;
    }

    public String getModel(){
        return this.model;
    }
}
