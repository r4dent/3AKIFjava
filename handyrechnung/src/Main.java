import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grundgebühr = 9.99;
        double minuten = 1000;
        double daten = 10;
        double userMinute = 0;
        double userDaten = 0;
        double rechnung;
        //inkludiert sind 1000 Freiminuten und 10 GB an Daten.
        //Minute kostet dann 20 Cent
        //Gigabyte 1,5 Euro

        System.out.println("Berechnung der Monatlichen Handyrechnung");
        System.out.println("Bitte geben Sie die verbrauchten Minuten des aktuellen Monats ein:");
        double userMinutenEingabe = Double.parseDouble(scanner.nextLine());
        if (userMinute > 1000){userMinute = userMinutenEingabe;}else{userMinute = 0;}
        System.out.println("Bitte geben Sie die verbrauchte Datenmenge in GB des aktuellen Monats ein:");
        double userDatenEingabe = Double.parseDouble(scanner.nextLine());
        if ( userDaten > 10){userDaten = userDatenEingabe;}else{userDaten = 0;}
        userMinute = Double.parseDouble(scanner.nextLine());

        rechnung = grundgebühr + userMinute + userDaten;

        System.out.println("Ihre Handyrechnnung dieses Monat beträgt:");
        System.out.println(rechnung);
    }
}