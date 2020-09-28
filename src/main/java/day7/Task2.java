package day7;

public class Task2 {
    public static void main(String[] args) {
        Player arshavin1 = new Player();
        Player arshavin2 = new Player();
        Player arshavin3 = new Player();
        Player arshavin4 = new Player();
        Player arshavin5 = new Player();
        Player arshavin6 = new Player();

        System.out.println("Игра вот-вот начнется! Количество футболистов на поле: " + Player.getPlayersCounter());
        Player.info();

        Player arshavin7 = new Player();
        System.out.println("Пришел еще один футболист Аршавин7");
        System.out.println("Количество футболистов на поле: " + Player.getPlayersCounter());

        System.out.println("Отлично проявил себя футболист Аршавин1!");
        while (arshavin1.getStamina() > Player.MIN_STAMINA) {
            arshavin1.run();
        }

        System.out.println("Отлично проявил себя футболист Аршавин2!");
        while (arshavin2.getStamina() > Player.MIN_STAMINA) {
            arshavin2.run();
        }

        Player.info();
        System.out.println("Количество футболистов на поле: " + Player.getPlayersCounter());
    }
}
