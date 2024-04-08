import java.util.Random;
import java.util.Scanner;

public class Zad18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // losowanie liczby z przedziału 1-100
        int guess;
        int attempts = 0;
        do {
            System.out.print("Podaj liczbę (1-100): ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > randomNumber) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else if (guess < randomNumber) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            } else {
                System.out.println("Gratulacje! Odgadłeś liczbę!");
                System.out.println("Liczba prób: " + attempts);
            }
        } while (guess != randomNumber);
        scanner.close();
    }
}
