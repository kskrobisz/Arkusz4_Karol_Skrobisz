import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj szybkość pojazdu (w km/h): ");
        int speed = scanner.nextInt();
        System.out.print("Podaj liczbę godzin podróży: ");
        int hours = scanner.nextInt();

        System.out.println("Godzina   Przebyta odległość");
        System.out.println("-----------------------------");
        for (int i = 1; i <= hours; i++) {
            int distance = speed * i;
            System.out.println(i + "         " + distance);
        }
        scanner.close();
    }
}
