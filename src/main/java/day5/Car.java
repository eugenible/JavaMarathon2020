package day5;

public class Car {
    private int year;
    private String color, model;

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
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
