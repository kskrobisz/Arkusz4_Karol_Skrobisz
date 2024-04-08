import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sales = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj dzisiejszą wartość sprzedaży dla sklepu nr " + (i + 1) + ": ");
            sales[i] = scanner.nextInt() / 100; // Za każde 100 złotych jeden gwiazdkowy słup
        }
        System.out.println("WYKRES SŁUPKOWY Z POZIOMEM SPRZEDAŻY");
        for (int i = 0; i < 5; i++) {
            System.out.print("Sklep nr " + (i + 1) + ": ");
            for (int j = 0; j < sales[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
