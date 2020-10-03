package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse sklad = new Warehouse();
        Picker assembler = new Picker(sklad);
        Courier kura = new Courier(sklad);

        for (int i = 0; i < 1501; i++) {
            assembler.doWork();
            assembler.bonus();
        }

        for (int i = 0; i < 1001; i++) {
            kura.doWork();
            kura.bonus();
        }

        System.out.println(sklad.toString());
        System.out.println("Зарплата сборщика составляет " + assembler.getSalary() +
                "\nЗарплата курьера составляет " + kura.getSalary());

        Warehouse sklad2 = new Warehouse();
        Picker assembler2 = new Picker(sklad2);
        Courier kura2 = new Courier(sklad2);

        System.out.println("\nСоздали новый склад и новых работников, проверяем сотрудников первого склада\n"
                + sklad.toString());
        System.out.println("Зарплата сборщика составляет " + assembler.getSalary() +
                "\nЗарплата курьера составляет " + kura.getSalary());
    }
}
