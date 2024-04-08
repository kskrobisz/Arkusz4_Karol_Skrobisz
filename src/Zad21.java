import java.util.Random;

public class Zad21 {
    public static void main(String[] args) {
        Random random = new Random();
        int computerWins = 0;
        int userWins = 0;

        for (int i = 0; i < 10; i++) {
            int computerRoll = random.nextInt(6) + 1; // rzut komputera
            int userRoll = random.nextInt(6) + 1; // rzut użytkownika
            System.out.println("Rzut " + (i + 1) + ": Komputer: " + computerRoll + ", Użytkownik: " + userRoll);
            if (computerRoll > userRoll) {
                computerWins++;
            } else if (userRoll > computerRoll) {
                userWins++;
            }
        }

        if (computerWins > userWins) {
            System.out.println("Komputer wygrywa grę!");
        } else if (userWins > computerWins) {
            System.out.println("Użytkownik wygrywa grę!");
        } else {
            System.out.println("Remis!");
        }
    }
}
