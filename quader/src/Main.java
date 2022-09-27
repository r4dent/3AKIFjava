import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declaring varibles
        double a;
        double b;
        double h;
        double lenght;
        double surface;
        double volume;

        //user input
        System.out.println("___________________________________________________________________________");
        System.out.println("Zur berechnung eines Quaders geben Sie bitte die Länge, Breite und Höhe an.");
        System.out.println("Länge in cm:");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Breite in cm");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("Höhe in cm");
        h = Double.parseDouble(scanner.nextLine());

        //calculation
        lenght = 4 * (a + b + h);
        surface = 2 * (a * b + a * h + b * h);
        volume = a * b * h;

        //output
        System.out.println("Summe der Kantenlängen = " + lenght + " cm");
        System.out.println("Oberfläche = " + surface + " cm²");
        System.out.println("Volumen = " + volume + " cm³");
    }
}