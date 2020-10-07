package day13;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Евгений");
        User u2 = new User("Анастасия");
        User u3 = new User("Кошка Ксюша");

        Scanner readNow = new Scanner(System.in);

        u1.sendMessage(u2, readNow.nextLine());
        u1.sendMessage(u2, readNow.nextLine());

        u2.sendMessage(u1, readNow.nextLine());
        u2.sendMessage(u1, readNow.nextLine());
        u2.sendMessage(u1, readNow.nextLine());

        u3.sendMessage(u1, readNow.nextLine());
        u3.sendMessage(u1, readNow.nextLine());
        u3.sendMessage(u1, readNow.nextLine());

        u1.sendMessage(u3, readNow.nextLine());
        u1.sendMessage(u3, readNow.nextLine());
        u1.sendMessage(u3, readNow.nextLine());

        u3.sendMessage(u1, readNow.nextLine());

        MessageDatabase.showDialog(u1, u3);

        System.out.println(u1.isSubscribed(u2));
        System.out.println(u1.isFriend(u2));
        u1.subscribe(u2);
        System.out.println(u1.isSubscribed(u2));
        System.out.println(u1.isFriend(u2));
        u2.subscribe(u1);
        System.out.println(u1.isFriend(u2));
    }
}

