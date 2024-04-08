import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String name = scanner.nextLine();
        System.out.print("Opisz siebie: ");
        String description = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("moja_strona.html");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<center>");
            printWriter.println("<h1>" + name + "</h1>");
            printWriter.println("</center>");
            printWriter.println("<hr />");
            printWriter.println(description);
            printWriter.println("<hr />");
            printWriter.println("</body>");
            printWriter.println("</html>");
            printWriter.close();
            System.out.println("Strona internetowa została wygenerowana pomyślnie.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas generowania strony: " + e.getMessage());
        }

        scanner.close();
    }
}
