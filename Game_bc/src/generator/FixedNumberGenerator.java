package generator;

import java.util.Scanner;

public class FixedNumberGenerator implements NumberGenerator {
    private final int min;
    private final int max;
    private final Scanner scan = new Scanner(System.in);


    public FixedNumberGenerator(int difficulty) {

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
    public String GenerateNumber() {
        System.out.println("Введіть число від " + min + " до " + max);
        String fixedNumber = scan.nextLine();

        if(Integer.parseInt(fixedNumber) >= min && Integer.parseInt(fixedNumber)<=max){
            return fixedNumber;
        } else if (!fixedNumber.matches("\\d{4}")){
            System.out.println("Введіть чотирьохзначне число!");
            return GenerateNumber();
        }
        else{
            System.out.println("Ви ввели число за межами рівня, будь-ласка повторіть");
            return GenerateNumber();
        }
    }
}