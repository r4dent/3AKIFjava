import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double preis;
        System.out.println("Geben Sie den gesammt Betrag an:");
        Scanner scanner = new Scanner(System.in);
        preis = Double.valueOf(scanner.nextLine());
        if (preis < 10.0){
            System.out.println("Discountpreis: " + preis);
        } else{
            System.out.println("Discountpreis:");
            System.out.println(preis - (preis*0.1));
        }
    }
}