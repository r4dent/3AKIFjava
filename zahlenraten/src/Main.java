import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** ZAHLEN RATEN ***");
        System.out.println("Erraten Sie eine Zahl zwischen 1 und 100.");
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int guess;
        Random r = new Random();
        int random = r.nextInt(100 + 1);
        System.out.println(random);

        while (i <= 10) {
            System.out.println("-Geben Sie eine Zahl von 0 bis 100 an-");
            guess = scanner.nextInt();
            if (guess != random) {
                System.out.println("----Leider nicht die richtige Zahl----");
                System.out.println("------------noch " + (10-i) + " Versuche-----------");
                i++;
            } else {
                System.out.println("GEWINNER");
                break;
            }
        }
        System.out.println("Leider Verloren");
    }
}