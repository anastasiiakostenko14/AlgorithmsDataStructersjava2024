import generator.NumberGenerator;
import generator.RandomNumberGenerator;
import player.HumanPlayer;
import player.Player;

import java.util.Scanner;

public class PlayGame {
    private static int difficulty; // Статична змінна для збереження рівня складності

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привіт, перед тим, як розпочати гру. Обери параметри:)");

        chooseDifficulty(scanner);

        NumberGenerator numberOfGeneration;
        Player player;

        numberOfGeneration = chooseNumberGenerator(scanner);
        player = choosePlayer(scanner);

        Game game = new Game(player, numberOfGeneration);
        game.start();
    }

    private static void chooseDifficulty(Scanner scanner) {
        System.out.println("Обери рівень: ");
        System.out.println("0. Легкий (від 1000 до 2000)");
        System.out.println("1. Середній (від 1000 до 4000)");
        System.out.println("2. Складний (від 1000 до 7000)");
        System.out.println("3. Дуже складний (від 1000 до 9999)");
        difficulty = scanner.nextInt();
        scanner.nextLine();
    }

    private static NumberGenerator chooseNumberGenerator(Scanner scanner) {
        NumberGenerator numberGenerator = null;

        while (numberGenerator == null) {
            System.out.println("Обери як буде загадуватись число:");
            System.out.println("0. Я хочу задати");
            System.out.println("1. Задає комп'ютер");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                numberGenerator = new FixedNumberGenerator(difficulty);
            } else if (choice == 1) {
                numberGenerator = new RandomNumberGenerator(difficulty);
            } else {
                System.out.println("Немає такого вибору! Будь-ласка оберіть 0 або 1");
            }
        }
        return numberGenerator;
    }

    private static Player choosePlayer(Scanner scanner) {
        Player player = null;

        while (player == null) {
            System.out.println("Обери хто буде грати?");
            System.out.println("0. Я (Людина)");
            System.out.println("1. AI гравець");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                player = new HumanPlayer(difficulty);
            } else if (choice == 1) {
                player = new Game.AIPlayer(difficulty);
            } else {
                System.out.println("Немає такого вибору! Будь-ласка оберіть 0 або 1");
            }
        }
        return player;
    }
}
