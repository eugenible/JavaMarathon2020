package day9.Task1;

public class Teacher extends Human {
    private String subject;

    public void setSubjectName(String subject) {
        this.subject = subject;
    }

    public String getSubjectName() {
        return this.subject;
    }

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.getName());
    }
}
