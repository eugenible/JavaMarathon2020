package day11;

public class Courier implements Worker {
    private int salary;
    private int bonusCounter;

    private Warehouse place;

    public Courier(Warehouse place) {
        this.salary = 0;
        this.bonusCounter = 0;
        this.place = place;
    }

    public int getSalary() {
        return this.salary;
    }

    public void doWork() {
        this.salary += 100;
        this.place.addBalance();
    }

    public void bonus() {
        if (this.place.getBalance() - (1000000 * this.bonusCounter) >= 1000000) {
            this.salary *= 2;
            this.bonusCounter++;
        }
    }
}
