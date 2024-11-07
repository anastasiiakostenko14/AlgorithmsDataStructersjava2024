import java.util.Random;


public class AIplayer implements Player{
    private final Random random = new Random();

    @Override
    public String getGuess(){
        int guess = 1000 + random.nextInt(9000);
        System.out.println("AI намагається вгадати, його здогадка: " + guess);
        return String.valueOf(guess);
    }
}
