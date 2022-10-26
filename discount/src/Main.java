import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** DISCOUNT von 10% bei einem EINKAUF von mehr als 10€!!! ***");
        Scanner scanner = new Scanner(System.in);

        int discount;
        int betrag;
        System.out.println("Geben Sie einen Betrag ein um den Discount zu erfahren:");
        System.out.print("Betrag: ");
        betrag = scanner.nextInt();

        if (betrag > 10){
            betrag = betrag - betrag * 10 / 100;
            System.out.println("Discount Preis: " + betrag);
        }
    }
}