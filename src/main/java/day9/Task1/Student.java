package day9.Task1;

public class Student extends Human {
    private String group;

    public void setGroupName(String group) {
        this.group = group;
    }

    public String getGroupName() {
        return this.group;
    }

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + this.getName());
    }


}
