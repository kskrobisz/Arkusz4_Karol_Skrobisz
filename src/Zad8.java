import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę lat: ");
        int years = scanner.nextInt();
        if (years < 1) {
            System.out.println("Błąd: Liczba lat musi być większa niż 0.");
            return;
        }
        int totalMonths = years * 12;
        int totalRainfall = 0;
        for (int i = 1; i <= years; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print("Podaj ilość opadów w cm dla miesiąca " + j + " w roku " + i + ": ");
                int rainfall = scanner.nextInt();
                if (rainfall < 0) {
                    System.out.println("Błąd: Ilość opadów nie może być ujemna.");
                    return;
                }
                totalRainfall += rainfall;
            }
        }
        double averageRainfall = (double) totalRainfall / totalMonths;
        System.out.println("Średni poziom opadów: " + averageRainfall + " cm");
        scanner.close();
    }
}
