package TicketChecker;
import java.util.Scanner;

//Tikrina įvestą bilieto numerį
public class ConsoleNumber {
    public static void main(String[] args) {
        System.out.println("Įveskite bilieto numerį: ");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        while (in.length() != 6) {
            System.out.println("Netinkamas numeris. Bandykite dar kartą: ");
            in = scanner.nextLine();
        }
        int number = Integer.parseInt(in);

        boolean lucky = checkNumber(number);
        if (lucky) {
            System.out.println("Bilietas laimingas");
        }
       else {
            System.out.println("Bilietas nelaimingas");
        }

    }
    public static boolean checkNumber(int number) {
        boolean isLucky = false;
        boolean isUnique = true;
        int[] digits = new int[6];
        int index = 0;
        while (number > 0) {
            digits[index] = number%10;
            index++;
            number /= 10;
        }
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i+1; j < digits.length; j++) {
                if (digits[i] == digits[j]) {
                    isUnique = false;
                    break;
                }
            }
        }
        if (isUnique) {
            int sum1 = digits[0] + digits[1] + digits[2];
            int sum2 = digits[3] + digits[4] + digits[5];
            if (sum1 == sum2) {
                isLucky = true;
            }
        }
        return isLucky;

    }
}
