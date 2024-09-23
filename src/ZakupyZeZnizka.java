import java.util.Scanner;

public class ZakupyZeZnizka {
    public static void main(String[] args) {
        // Program oblicza końcową kwotę zakupu z uwzględnieniem 10% zniżki dla studentów

        Scanner scanner = new Scanner(System.in);

        // Pobranie kwoty zakupu od użytkownika
        System.out.print("Podaj kwotę zakupu: ");
        double kwotaZakupu = scanner.nextDouble();

        // Zapytanie użytkownika, czy jest studentem
        System.out.print("Czy jesteś studentem? (tak/nie): ");
        String odpowiedz = scanner.next();

        // Instrukcja warunkowa sprawdzająca, czy użytkownik jest studentem
        if (odpowiedz.equalsIgnoreCase("tak")) {
            // Jeżeli użytkownik jest studentem, zastosuj 10% zniżki
            double znizka = kwotaZakupu * 0.10;  // Obliczenie 10% zniżki
            kwotaZakupu -= znizka;  // Pomniejszenie kwoty zakupu o zniżkę
            System.out.println("Zastosowano 10% zniżki dla studentów.");
        } else {
            // Jeśli użytkownik nie jest studentem, brak zniżki
            System.out.println("Brak zniżki dla studentów.");
        }

        // Wyświetlenie końcowej kwoty do zapłaty
        System.out.println("Końcowa kwota do zapłaty: " + kwotaZakupu + " PLN");

        scanner.close();  // Zakończenie działania skanera
    }
}
