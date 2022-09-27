import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double bmi;
        System.out.println("Bitte gib deine Körpergröße in cm ein: ");
        Double koerperGroesse = Double.valueOf(scanner.nextLine());
        System.out.println("Gib dein Gewicht in kg an: ");
        Double koerperGewicht = Double.valueOf(scanner.nextLine());
        koerperGroesse = koerperGroesse / 100;
        bmi = koerperGewicht / (koerperGroesse * koerperGroesse);//Math.poe(koerperGewicht, 2)
        System.out.println("Dein BMI ist: " + Math.round(bmi) + " m/l²");
    }
}
