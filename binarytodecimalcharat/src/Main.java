import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binär zu Dezimal mit charAT.");
        System.out.println("Geben Sie eine Binärzahl ein:");
        String binary;
        int x = 0;
        int lenght;
        int base = 1;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        binary = scanner.nextLine();
        lenght = binary.length() - 1;
        while (lenght >= 0){
            String a = String.valueOf(binary.charAt(lenght));
            int y = Integer.parseInt(a) * base;
            lenght--;
            base = base * 2;
            result = x += y;
        }
        System.out.println(result);
    }
}