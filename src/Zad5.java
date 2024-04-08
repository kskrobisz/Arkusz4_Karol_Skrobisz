import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj łańcuch znaków: ");
        String text = scanner.nextLine();
        System.out.print("Podaj znak do zliczenia: ");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Liczba wystąpień znaku '" + ch + "' w łańcuchu: " + count);
        scanner.close();
    }
}
