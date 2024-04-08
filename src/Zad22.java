import java.util.Random;
import java.util.Scanner;

public class Zad22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalAmountPlayed = 0;
        int totalWinnings = 0;

        while (true) {
            System.out.print("Podaj kwotę pieniędzy do wrzucenia do automatu (0 aby zakończyć): ");
            int amountPlayed = scanner.nextInt();
            if (amountPlayed == 0) {
                break;
            }
            totalAmountPlayed += amountPlayed;

            int matchings = 0;
            String[] images = {"Wiśnie", "Pomarańcze", "Śliwki", "Dzwonki", "Melony", "Bary"};
            for (int i = 0; i < 3; i++) {
                int randomIndex = random.nextInt(images.length);
                System.out.print(images[randomIndex] + " ");
                if (i == 0) {
                    matchings++;
                }
            }
            System.out.println();

            if (matchings == 3) {
                System.out.println("Gratulacje! Wygrałeś trzykrotność postawionej kwoty.");
                totalWinnings += amountPlayed * 3;
            } else if (matchings == 2) {
                System.out.println("Gratulacje! Wygrałeś dwukrotność postawionej kwoty.");
                totalWinnings += amountPlayed * 2;
            } else {
                System.out.println("Niestety, nie wygrałeś nic.");
            }
        }

        System.out.println("Łączna kwota wrzucona do automatu: " + totalAmountPlayed);
        System.out.println("Łączna wartość wygranych: " + totalWinnings);
        scanner.close();
    }
}
