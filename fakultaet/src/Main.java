import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** FAKULTÄT ***");
        System.out.println("Geben Sie eine Zahl ein um die Fakultät zu erfahren:");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Die Fakultät von " + n + " ist " + fact);
    }
}