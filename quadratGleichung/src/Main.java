import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x;
        Double ergebnis;
        //3x² - 8x + 4
        System.out.println("Gib einen Wert für x ein: ");
        x = Double.valueOf(scanner.nextLine());
        ergebnis = 3 * (x * x) - 8 * x + 4;
        System.out.println("Das Ergebnis lautet: " + ergebnis);
    }
}