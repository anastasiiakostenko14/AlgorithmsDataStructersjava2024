import java.util.Scanner;

public class FixedGenerator implements NumberGenerator {
    private final Scanner scan = new Scanner(System.in);

    @Override
    public String GenerateNumber() {
        String fixedNumber;
        while (true) {
            System.out.println("Введіть число, яке буде вгадуватись");
            fixedNumber = scan.nextLine();
            if (fixedNumber.matches("\\d{4}")) {
                break;
            } else {
                System.out.println("Помилка, введіть чотирьохзначне число");
            }
        }
        return fixedNumber;
    }
}