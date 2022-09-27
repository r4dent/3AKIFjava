import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grad;
        double bogenmass;

        System.out.println("Bitte geben Sie die Grad des Winkels an für den Sie gerne das Bogenmaß hätten: (Bsp: 45)");
        grad = Double.parseDouble(scanner.nextLine());
        bogenmass = grad * Math.PI / 180;
        System.out.println("Das gesuchte Bogenmaß ist: " + bogenmass);
    }
}