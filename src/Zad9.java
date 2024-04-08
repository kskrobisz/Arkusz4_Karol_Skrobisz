import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj początkową liczbę organizmów: ");
        int initialPopulation = scanner.nextInt();
        if (initialPopulation < 2) {
            System.out.println("Błąd: Początkowa liczba organizmów musi być większa niż 1.");
            return;
        }
        System.out.print("Podaj średni dzienny przyrost populacji (w procentach): ");
        double dailyGrowthRate = scanner.nextDouble();
        if (dailyGrowthRate < 0) {
            System.out.println("Błąd: Średni dzienny przyrost populacji nie może być ujemny.");
            return;
        }
        System.out.print("Podaj liczbę dni rozmnażania: ");
        int days = scanner.nextInt();
        if (days < 1) {
            System.out.println("Błąd: Liczba dni rozmnażania musi być większa lub równa 1.");
            return;
        }
        System.out.println("Dzień   Wielkość populacji");
        System.out.println("---------------------------");
        int population = initialPopulation;
        for (int i = 1; i <= days; i++) {
            System.out.println(i + "      " + population);
            population += (int) Math.round(population * (dailyGrowthRate / 100));
        }
        scanner.close();
    }
}
