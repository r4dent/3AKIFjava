import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstMonth;
        Double firstRain;
        String secondMonth;
        Double secondRain;
        String thirdMonth;
        Double thirdRain;

        System.out.println("Erstes Monat eingeben:");
        firstMonth = scanner.nextLine();
        System.out.println("Niederschlag eingeben:");
        firstRain = Double.valueOf(scanner.nextLine());

        System.out.println("Zweites Monat eingeben:");
        secondMonth = scanner.nextLine();
        System.out.println("Niederschlag eingeben:");
        secondRain = Double.valueOf(scanner.nextLine());

        System.out.println("Drittes Monat eingeben:");
        thirdMonth = scanner.nextLine();
        System.out.println("Niederschlag eingeben:");
        thirdRain = Double.valueOf(scanner.nextLine());

        Double durchschnitt = (firstRain + secondRain + thirdRain) / 3;

        System.out.println("Durchschnittlicher Niederschlag: " + durchschnitt);
    }
}