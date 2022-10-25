import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Das Wort das Sie eingeben wird so oft angeschrieben wie es Buchstaben hat.");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int x = 1;
        while (x <= word.length()){
            System.out.println(word);
            x++;
        }
    }
}