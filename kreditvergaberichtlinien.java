import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Eingabe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Kaufpreis der Immobilie ein: ");
        String kaufpreisImmobilieEingabe = scanner.nextLine();
        System.out.println("Bitte geben Sie die geschätzte monatliche Kreditrate ein: ");
        String monatlicheKreditrateEingabe = scanner.nextLine();
        //Verarbeitung
        double kaufpreisImmobilie = Double.parseDouble(kaufpreisImmobilieEingabe);
        double monatlicheKreditrate = Double.valueOf(monatlicheKreditrateEingabe);//Redundant valueOf()
        double eigenkapitalMinimum = kaufpreisImmobilie * 0.2;
        double nettoEinkommenMinimum = monatlicheKreditrate / 40 * 100;
        //Ausgabe
        System.out.println("Sie müssen ein Eigenkapital von mindestens " + Math.round(eigenkapitalMinimum) + " Euro verfügen.");
        System.out.println("Monatlich müssen Ihnen im Ihrem Haushalt mindestens über " + Math.round(nettoEinkommenMinimum) + " Euro verfügen.");
    }
}
