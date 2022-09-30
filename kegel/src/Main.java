import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r;
        double h;
        double s;
        double A;
        double V;

        System.out.println("Berechnung der Seitenlänge s, der Oberfläche A und des Volumens");
        System.out.println("bei Angabe des Radius und der Höhe.");
        System.out.println("Gib den Radius an:");
        r = Double.parseDouble(scanner.nextLine());
        System.out.println("Gib die Höhe an:");
        h = Double.parseDouble(scanner.nextLine());
        s = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        A = Math.PI * Math.pow(r, 2) + Math.PI * r * s;
        V = (1.0 / 3.0 * Math.PI) * (Math.pow(r, 2) * h);
        System.out.println("Die Mantellinie s = " + s);
        System.out.println("Die Fläche A = " + A);
        System.out.println("Das Volumen V = " + V);
    }
}