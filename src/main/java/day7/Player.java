package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player() {
        stamina = (int) (Math.random() * 11 + 90);
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return this.stamina;
    }

    public void run() {
        if (this.stamina == MIN_STAMINA) {
            System.out.println("Выносливость футболиста не может опуститься ниже 0");
        } else {
            this.stamina--;
            if (this.stamina == MIN_STAMINA) {
                System.out.println("Футболист устал, и он уходит отдохнуть на скамейку запасных");
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            String detail = "";
            switch (6 - countPlayers) {
                case 6:
                case 5:
                    detail = " свободных мест";
                    break;
                case 4:
                case 3:
                case 2:
                    detail = " свободных места";
                    break;
                case 1:
                    detail = " свободное место";
            }
            System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + detail);
        } else {
            System.out.println("Свободных мест в командах нет");
        }
    }

    public static int getPlayersCounter() {
        return countPlayers;
    }
}
