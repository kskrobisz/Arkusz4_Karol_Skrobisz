import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj miesięczny budżet: ");
        double budget = scanner.nextDouble();
        double expenses = 0;
        double expense;
        do {
            System.out.print("Podaj wydatek (lub wpisz 0, aby zakończyć): ");
            expense = scanner.nextDouble();
            expenses += expense;
        } while (expense != 0);
        double difference = budget - expenses;
        if (difference >= 0) {
            System.out.println("Budżet został nie przekroczony. Pozostało: " + difference + " zł.");
        } else {
            System.out.println("Budżet został przekroczony. Brakuje: " + (-difference) + " zł.");
        }
        scanner.close();
    }
}
