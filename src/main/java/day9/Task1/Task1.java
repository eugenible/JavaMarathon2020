package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student genius = new Student("Jeka", "ECP-228");
        Teacher ziryanov = new Teacher("Ziryanov", "AES");
        System.out.println("Студент учится в группе " + genius.getGroupName());
        System.out.println("Препод ведет предмет " + ziryanov.getSubjectName());
        genius.printInfo();
        ziryanov.printInfo();
    }
}
