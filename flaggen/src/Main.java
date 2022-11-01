import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        System.out.println("*** SPASS MIT FLAGGEN ***");
        System.out.println("Wie hoch soll Ihre Flagge sein?");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int counter1 = 0;
        int counter2 = 0;
        do {
            while (counter1 < counter2) {
                System.out.print(counter2);
                counter1++;
            }
            System.out.println();
            counter1 = 0;
            counter2++;
        } while (counter2 <= height);
    }
}