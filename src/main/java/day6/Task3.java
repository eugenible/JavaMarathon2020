package day6;

public class Task3 {
    public static void main(String[] args) {
        Prepod prepod1 = new Prepod("Лыкин Анатолий Денисович", "Автономные энергосистемы");
        Student student1 = new Student("Третьяков Евгений Сергеевич");
        prepod1.evaluate(student1, 5);
    }
}