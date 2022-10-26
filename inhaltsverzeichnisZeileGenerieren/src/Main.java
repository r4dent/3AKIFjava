import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** INHALTSVERZEICHNIS ZEILEN GENERIEREN ***");
        Scanner scanner = new Scanner(System.in);

        int gesamtLaenge = 60;
        String ueberschrift = "";
        String seite = "";
        int differenz = 0;

        System.out.println("Geben Sie eine Überschrift ein:");
        ueberschrift = scanner.nextLine();
        System.out.println("Auf welcher Seite beginnt die Überschrift:");
        seite = seite + scanner.nextLine();
        differenz = ueberschrift.length() + seite.length();

        System.out.print(ueberschrift + " ");
        while (differenz <= gesamtLaenge) {
            System.out.print(".");
            differenz++;
        }
        System.out.println(" " + seite);// das Leerzeichen ist nur für die Optik.
    }
}