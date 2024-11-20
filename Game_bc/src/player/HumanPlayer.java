package player;

import java.util.Scanner;
public class HumanPlayer implements Player {
    private final int min;
    private final int max;
    private final Scanner scanner = new Scanner(System.in);

    public HumanPlayer(int difficulty) {

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
        System.out.println("Введіть число від " + min + " до " + max);
        String fixedNumber = scanner.nextLine();

        if(Integer.parseInt(fixedNumber) >= min && Integer.parseInt(fixedNumber)<=max){
            return fixedNumber;
        } else if (!fixedNumber.matches("\\d{4}")){
            System.out.println("Введіть чотирьохзначне число!");
            return getGuess();
        }
        else{
            System.out.println("Ви ввели число за межами рівня, будь-ласка повторіть");
            return getGuess();
        }
    }
}
