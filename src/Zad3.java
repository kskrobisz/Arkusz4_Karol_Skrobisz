import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj prędkość pojazdu (w km/h): ");
            int speed = scanner.nextInt();
            System.out.print("Podaj czas podróży (w godzinach): ");
            int time = scanner.nextInt();
            PrintWriter writer = new PrintWriter(new FileWriter("odleglosc.txt"));
            writer.println("Godzina   Przebyta odległość");
            writer.println("-----------------------------");
            for (int i = 1; i <= time; i++) {
                writer.println(i + "         " + speed * i);
            }
            writer.close();
            scanner.close();
            System.out.println("Dane zostały zapisane do pliku 'odleglosc.txt'.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania danych do pliku.");
            e.printStackTrace();
        }
    }
}
