import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj nazwę pliku: ");
            String fileName = scanner.nextLine();
            System.out.print("Podaj znak do zliczenia: ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine(); // consume newline
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            int count = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        count++;
                    }
                }
            }
            System.out.println("Liczba wystąpień znaku '" + ch + "' w pliku: " + count);
            fileScanner.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono podanego pliku.");
            e.printStackTrace();
        }
    }
}
