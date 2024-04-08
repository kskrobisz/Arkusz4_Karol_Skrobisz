import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku: ");
        String fileName = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int linesCount = 0;
            while ((line = reader.readLine()) != null && linesCount < 5) {
                System.out.println(line);
                linesCount++;
            }
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku: " + e.getMessage());
        }
        scanner.close();
    }
}
