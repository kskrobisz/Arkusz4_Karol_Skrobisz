import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Podaj serię liczb całkowitych (-99 aby zakończyć): ");
        while (true) {
            int number = scanner.nextInt();
            if (number == -99) {
                break;
            }
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Największa wartość: " + max);
        System.out.println("Najmniejsza wartość: " + min);
        scanner.close();
    }
}
