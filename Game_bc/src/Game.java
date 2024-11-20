import generator.NumberGenerator;
import player.Player;

import java.util.Random;

public class Game {
    private final String secretNumber;
    private final Player player;

    public Game(Player player, NumberGenerator numberGenerated){
        this.player = player;
        this.secretNumber = numberGenerated.GenerateNumber();
    }

    public void start(){
        System.out.println("Вітаємо в грі 'Бики і Корови'!");
        System.out.println("Правила гри наступні: Ви повинні відгадати чотирьохзначне число.\n В разі якщо ви відгадали деякі цифри, та вони стоять на правильних місцях ви отримаєте підказку\n (кількість биків = кількість правильних цифр на своїх місцях),  а скільки цифр вгадано правильно, але стоять на неправильних місцях (корови).\n ");
        System.out.println("Почнімо!");

        while(true){
            String guess = player.getGuess();

            if(guess.equals(secretNumber)){
                System.out.println("Finally! Ви вгадали це число!!");
                break;
            } else {
                int bulls = countBulls(guess, secretNumber);
                int cows = countCows(guess, secretNumber);
                System.out.printf("Майже!Биків: %d, корів: %d%n", bulls, cows);
            }
        }
    }

    private int countBulls(String guess, String secretNumber){
        int bulls = 0;
        for(int i = 0; i< guess.length(); i++){
            if(guess.charAt(i) == secretNumber.charAt(i)){
                bulls ++;
            }
        }
        return bulls;
    }

    private int countCows(String guess, String secretNumber) {
        int cows = 0;
        boolean[] bullFlags = new boolean[guess.length()]; // Маркуємо позиції, які вже є "биками"

        // Спочатку відзначаємо позиції "биків"
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == secretNumber.charAt(i)) {
                bullFlags[i] = true; // Ця позиція - "бик"
            }
        }

        // Потім рахуємо "корів" для цифр, які не є "биками"
        for (int i = 0; i < guess.length(); i++) {
            if (!bullFlags[i]) { // Якщо ця цифра не є "биком"
                char c = guess.charAt(i);
                for (int j = 0; j < secretNumber.length(); j++) {
                    if (i != j && c == secretNumber.charAt(j) && !bullFlags[j]) {
                        cows++;
                        bullFlags[j] = true; // Помічаємо цю цифру, щоб уникнути подвійного врахування
                        break;
                    }
                }
            }
        }

        return cows;
    }
}
