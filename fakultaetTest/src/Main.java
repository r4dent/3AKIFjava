import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** FAKULTÄT - TEST***");
        System.out.println("Geben Sie eine Zahl ein um zu sehen ob sie eine Fakultät ist:");
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divisor = 2;
        int result = 0;
        int rest = dividend%divisor;
        if (dividend % divisor == 0 && dividend != 1) {
            while (dividend % divisor == 0) {
                dividend = dividend / divisor;
                divisor++;

            }
            if (dividend == 1) {
                divisor = divisor - 1;
                System.out.println("Fakultät von " + divisor);
            }
            else {
                System.out.println("Keine Fakultät");
            }
        }else{
            System.out.println("Keine Fakultät");
        }
    }
}
