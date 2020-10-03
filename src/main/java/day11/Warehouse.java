package day11;

public class Warehouse {
    private int countOrder = 0;
    private int balance = 0;

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCountOrder() {
        return this.countOrder;
    }

    public int getBalance() {
        return this.balance;
    }

    public void addBalance() {
        this.balance += 1000;
    }

    public void addCountOrder() {
        this.countOrder++;
    }


    @Override
    public String toString(){
        return ("Количество собранных заказов - " + this.getCountOrder() + ", доход от доставленных заказов - " + this.getBalance());
    }
}
