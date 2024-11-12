import java.util.Scanner;
public class Human implements Player{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String getGuess(){
        String input;
        while(true){
            System.out.println("Введіть чотирьохзначне число: ");
            input = scanner.nextLine();
            if(input.matches("\\d{4}") && !(input.charAt(0) =='0')){
                break;
            } else{
                System.out.println("Ви ввели не чотирьохзначне число! :(");
            }
        }
        return input;
    }

}
