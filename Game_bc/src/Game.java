public class Game {
    private final String secretNumber;
    private final Player player;

    public Game(Player player, NumberGenerator numberGenerated){
        this.player = player;
        this.secretNumber = numberGenerated.GenerateNumber();
    }

    public void start(){
        System.out.println("Вітаємо в ігрі 'Бики і Корови'!");
        System.out.println("Правила гри наступні: Ви повинні відгадати чотирьохзначне число.\n В разі якщо ви відгадали деякі цифри, та вони стоять на правильних місцях ви отримаєте підказку\n (кількіть биків = кількість правильних цифр на своїх місцях),  а скільки цифр вгадано правильно, але стоять на неправильних місцях (корови).\n ");
        System.out.println("Почнімо!");

        while(true){
            String guess = player.getGuess();

            if(guess.equals(secretNumber)){
                System.out.println("Finally! Ви вгадали це число!!");
                break;
            } else {
                int bulls = countBulls(guess, secretNumber);
                int cows = countCows(guess, secretNumber) - bulls;//тут мінусуємо биків,щоб показало тільки ті цифри,які не тільки вгадані,але і не на своїх місцях
                System.out.printf("Майже!Биків: %d, коров: %d%n", bulls, cows);
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

    private int countCows(String guess, String secretNumber){
        int cows = 0;
        for(char c: guess.toCharArray()){
            if(secretNumber.contains(String.valueOf(c))){
                cows ++;
            }
        }
        return cows;
    }
}
