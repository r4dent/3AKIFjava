import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double R;
        double r;
        double A;

        System.out.println("Berechnung der Fläche eines Kreisrings bei Angabe des großen und kleinen Radius.");
        System.out.println("Gib den großen Radius an:");
        R = Double.parseDouble(scanner.nextLine());
        System.out.println("Gib den kleinen Radius an:");
        r = Double.parseDouble(scanner.nextLine());
        A = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
        System.out.println("Die Fläche des Kreisrings = " + A);
    }
}