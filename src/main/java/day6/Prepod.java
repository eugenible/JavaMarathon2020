package day6;

import org.w3c.dom.ls.LSOutput;

public class Prepod {
    private String fio, subject;

    public Prepod(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFio() {
        return this.fio;
    }

    public String getSubject() {
        return this.subject;
    }

    public void evaluate(Student stud, int grade) {
        if (grade < 2 || grade > 5) {
            System.out.println("Неправильная оценка");
        } else {
            String result = "";
            switch (grade) {
                case 2:
                    result = "\"Неудовлетворительно\"";
                    break;
                case 3:
                    result = "\"Удовлетворительно\"";
                    break;
                case 4:
                    result = "\"Хорошо\"";
                    break;
                case 5:
                    result = "\"Отлично\"";
                    break;
            }
            System.out.print("Преподаватель " + this.getFio() + " оценил студента с именем " + stud.getFio());
            System.out.println(" по предмету " + this.getSubject() + " на оценку " + result);
        }
    }
}