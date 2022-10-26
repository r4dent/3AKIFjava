import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** MICROWELLENHERD ***");
        Scanner scanner = new Scanner(System.in);
        int posten;
        int erhitzungszeit;
        Double neueErhitzungszeit;


        System.out.println("Wie viele Sekunden erhitzen Sie normalerweise einen Posten?");
        erhitzungszeit = scanner.nextInt();
        System.out.println("Wie viele Posten wollen Sie erhitzen?");
        posten = scanner.nextInt();

        if (posten > 3) {
            System.out.println("Sie sollten nicht mehr als 3 Posten auf einmal erhitzen.");
        } else if (posten > 2) {
            System.out.println("Sie sollten 3 Posten " + erhitzungszeit*2 + " Sekunden lang erhitzen.");
        } else if (posten > 1) {
            System.out.println("Sie sollten 2 Posten " + erhitzungszeit*1.5 + " Sekunden lang erhitzen.");
        } else if (posten > 0) {
            System.out.println("Sie sollten 1 Posten " + erhitzungszeit + " Sekunden lang erhitzen.");
        } else {
            System.out.println("Sie sollten die Microwelle nicht leer einschalten.");
        }

    }
}