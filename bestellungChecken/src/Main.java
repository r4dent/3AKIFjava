import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bestellung");
        Scanner scanner = new Scanner(System.in);

        int schrauben = 0;
        int muttern = 0;
        int beilagscheiben = 0;
        int schraubenPreis = 5;
        int mutternPreis = 3;
        int gesamtBetrag;

        System.out.println("Wie viele Schrauben benötigen Sie?");
        schrauben = scanner.nextInt();
        System.out.println("Wie viele Muttern benötigen Sie?");
        muttern = scanner.nextInt();
        System.out.println("Wie viele Beilagscheiben benötigen Sie?");
        beilagscheiben = scanner.nextInt();
        gesamtBetrag = (schrauben*schraubenPreis + muttern*mutternPreis + beilagscheiben);
        if (schrauben == muttern && muttern == beilagscheiben){
            System.out.println(gesamtBetrag + " Cent");
            System.out.println(gesamtBetrag/100.0 + " EURO");
        } else {
            System.out.println("Bitte Kontrollieren Sie Ihre Bestellung.");
            System.out.println("Preis in Cent: " + gesamtBetrag + " Cent");
            System.out.println("Preis in Euro: " + gesamtBetrag/100.0 + " EURO");
        }
    }
}