import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę pięter w hotelu: ");
        int floors = scanner.nextInt();
        if (floors < 1) {
            System.out.println("Błąd: Liczba pięter musi być większa niż 0.");
            return;
        }
        int totalRooms = 0;
        int totalOccupiedRooms = 0;
        for (int i = 1; i <= floors; i++) {
            System.out.print("Podaj liczbę pokojów na piętrze " + i + ": ");
            int roomsOnFloor = scanner.nextInt();
            if (roomsOnFloor < 10) {
                System.out.println("Błąd: Liczba pokojów na piętrze musi być większa niż 9.");
                return;
            }
            totalRooms += roomsOnFloor;
            System.out.print("Podaj liczbę zajętych pokojów na piętrze " + i + ": ");
            int occupiedRoomsOnFloor = scanner.nextInt();
            totalOccupiedRooms += occupiedRoomsOnFloor;
        }
        double occupancyRate = (double) totalOccupiedRooms / totalRooms;
        System.out.println("Łączna liczba pokojów w hotelu: " + totalRooms);
        System.out.println("Liczba zajętych pokojów: " + totalOccupiedRooms);
        System.out.println("Liczba wolnych pokojów: " + (totalRooms - totalOccupiedRooms));
        System.out.println("Poziom obłożenia: " + (occupancyRate * 100) + "%");
        scanner.close();
    }
}
