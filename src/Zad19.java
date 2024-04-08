import java.util.Random;
import java.util.Scanner;

public class Zad19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] colors = {"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        int correctGuesses = 0;

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(colors.length); // losowanie indeksu koloru
            String color = colors[randomIndex]; // wybór losowego koloru
            System.out.println("Podaj kolor " + (i + 1) + ":");
            String userGuess = scanner.nextLine();
            if (userGuess.equalsIgnoreCase(color)) {
                correctGuesses++;
            }
        }

        System.out.println("Liczba poprawnych odpowiedzi: " + correctGuesses);
        scanner.close();
    }
}
