import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("DEATH VALLEY");
        Scanner scanner = new Scanner(System.in);
        int gallonen = 0;
        int prozent = 0;
        int meilenProGallone = 0;
        int realeReichweite = 0;

        System.out.println("Tankkapazität in Gallonen:");
        gallonen = scanner.nextInt();
        System.out.println("Benzinanzeige in Prozent (0 - 100):");
        prozent = scanner.nextInt();
        System.out.println("Meilen pro Gallone:");
        meilenProGallone = scanner.nextInt();
        realeReichweite = gallonen * prozent / 100 * meilenProGallone;
        if (realeReichweite < 200){
            System.out.println("Tanken!");
            System.out.println("Sie kommen nur noch " + realeReichweite + " Meilen weit!");
        } else {
            System.out.println("Sie können bei der nächsten Tankstelle tanken.");
        }
        System.out.println(realeReichweite);

    }
}