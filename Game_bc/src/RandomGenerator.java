import java.util.Random;

public class RandomGenerator implements NumberGenerator{
    private final Random random = new Random();

    @Override
    public String GenerateNumber(){
        int number = 1000 + random.nextInt(9000);
        return String.valueOf(number);
    }
}
