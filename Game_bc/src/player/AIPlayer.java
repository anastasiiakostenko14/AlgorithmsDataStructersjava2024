package player;

import java.util.Random;


public class AIPlayer implements Player {
    private final int min;
    private final int max;
    private final Random random = new Random();

    public AIPlayer(int difficulty){
        switch(difficulty){
            case 0:
                min = 1000;
                max = 2000;
                break;
            case 1:
                min = 1000;
                max = 4000;
                break;
            case 2:
                min = 1000;
                max = 7000;
                break;
            case 3:
                min = 1000;
                max = 9999;
                break;
            default:
                throw new IllegalArgumentException("Неправильний рівень складності");
        }
    }

    @Override
    public String getGuess(){
        int guess = min + random.nextInt(max - min + 1);
        System.out.println("AI гравець вгадує, його здогадка: " + guess);
        return String.valueOf(guess);
    }
}
