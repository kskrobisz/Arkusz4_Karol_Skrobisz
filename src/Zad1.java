import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dodatnią niezerową liczbę całkowitą: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Suma liczb od 1 do " + number + " wynosi: " + sum);
        scanner.close();
    }
}