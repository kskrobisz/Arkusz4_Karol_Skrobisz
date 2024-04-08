import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku wejściowego: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Podaj nazwę pliku wyjściowego: ");
        String outputFileName = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            System.out.println("Przekształcono tekst na wielkie litery i zapisano do pliku: " + outputFileName);
        } catch (IOException e) {
            System.err.println("Błąd operacji na plikach: " + e.getMessage());
        }
        scanner.close();
    }
}
