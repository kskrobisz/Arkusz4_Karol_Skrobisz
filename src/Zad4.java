import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę dni pracy: ");
        int days = scanner.nextInt();
        if (days < 1) {
            System.out.println("Błąd: Liczba dni musi być większa niż 0.");
            return;
        }
        long totalPay = 0;
        long currentPay = 1;
        System.out.println("Dzień    Wynagrodzenie");
        System.out.println("-----------------------");
        for (int i = 1; i <= days; i++) {
            System.out.println(i + "       " + currentPay);
            totalPay += currentPay;
            currentPay *= 2;
        }
        System.out.println("Sumaryczna kwota do wypłaty: " + totalPay + " złotych");
        scanner.close();
    }
}
