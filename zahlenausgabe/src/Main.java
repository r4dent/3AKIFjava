import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Von welcher bis zu welcher Zahl wollen Sie ausgeben?");
        int x, y;
        System.out.println("Erste Zahl:");
        x = scanner.nextInt();
        System.out.println("Zweite Zahl");
        y = scanner.nextInt();

        if (x < y){
            String z = MessageFormat.format("Alle Zahlen von {0} bis {1}", x, y);
            System.out.println(z);
            while (x <= y){
                System.out.println(x);
                x++;
            }
        }
        else{
            System.out.println("Die erste Zahl muss kleiner sein als die zweite Zahl. You Loose!");
        }
    }
}