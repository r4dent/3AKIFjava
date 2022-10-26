import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** WIRKSTOFFGEHALT EINES ARZNEIMITTELS ***");
        Scanner scanner = new Scanner(System.in);

        int monat = 0;
        Double wirkstoffgehalt = 100.0;

        while (wirkstoffgehalt >= 50) {
            monat++;
            wirkstoffgehalt = wirkstoffgehalt - (wirkstoffgehalt * 4 / 100);
            System.out.print("Monat: " + monat + " Wirkstoffgehalt: ");
            System.out.println(wirkstoffgehalt);
        }
        System.out.println("ABGELAUFEN!!!");
    }
}