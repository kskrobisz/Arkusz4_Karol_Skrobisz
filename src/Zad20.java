import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość boku kwadratu (1-15): ");
        int sideLength = scanner.nextInt();

        if (sideLength < 1 || sideLength > 15) {
            System.out.println("Nieprawidłowa długość boku.");
        } else {
            for (int i = 0; i < sideLength; i++) {
                for (int j = 0; j < sideLength; j++) {
                    System.out.print("X");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
