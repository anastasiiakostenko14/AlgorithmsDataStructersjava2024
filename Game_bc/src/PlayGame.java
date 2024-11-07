
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привіт, перед тим, як розпочати гру. Обери параметри:)");

        NumberGenerator numberOfGeneration;
        Player player;

        while (true) {
            System.out.println("Обери як буде загадуватись число:");
            System.out.println("0. Я хочу задати");
            System.out.println("1. Задає комп'ютер");
            int choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == 0) {
                System.out.println("Введіть число:");
                numberOfGeneration = new FixedGenerator();
                break;
            } else if (choice == 1) {
                numberOfGeneration = new RandomGenerator();
                break;
            } else {
                System.out.println("Немає такого вибору! Будь-ласка оберіть 0 або 1");
            }
        }

        while (true) {
            System.out.println("Обери хто буде грати?");
            System.out.println("0. Я(Людина)");
            System.out.println("1. AI гравець");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                player = new Human();
                break;
            } else if (choice == 1) {
                player = new AIplayer();
                break;
            } else {
                System.out.println("Немає такого вибору! Будь-ласка оберіть 0 або 1");
            }
        }
        Game game = new Game(player, numberOfGeneration);
        game.start();
    }
}