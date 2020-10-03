package day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse place;
    private int bonusCounter;

    public int getSalary() {
        return this.salary;
    }

    public Picker(Warehouse place) {
        this.salary = 0;
        this.place = place;
        this.bonusCounter = 0;
    }

    public void doWork() {
        this.place.addCountOrder();
        this.salary += 80;
    }

    public void bonus() {
        if (this.place.getCountOrder() - (1500 * this.bonusCounter) >= 1500) {
            this.salary *= 3;
            this.bonusCounter++;
        }
    }
}
