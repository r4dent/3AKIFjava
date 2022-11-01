import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** SUMMIEREN VON ZAHLEN ***");
        System.out.println("Geben Sie Zahlen ein um sie zu summieren:");
        Scanner scanner = new Scanner(System.in);

        int eingabe = 0;
        int ergebnis = 0;
        System.out.println(ergebnis);
        while (eingabe >= 0) {
            eingabe = scanner.nextInt();
            if (eingabe >= 0) {
                ergebnis = ergebnis + eingabe;
            }
        }
        System.out.println("Die Summe ist " + ergebnis);
    }
}