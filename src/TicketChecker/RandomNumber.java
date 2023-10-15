package TicketChecker;
import java.util.Random;
//Generuoja atsitiktinius blietus, kol randa laimingą
public class RandomNumber {
    public static void main(String[] args) {
        boolean isLucky = false;
        int count = 0;
        int randNum = 0;
        while (!isLucky) {
            randNum = new Random().nextInt(900000) + 100000;
            isLucky = ConsoleNumber.checkNumber(randNum);
            count++;
        }

        System.out.println("Laimingas numeris yra: " + randNum);
        System.out.println("Bandymų skaičius: " + count);
    }
}
