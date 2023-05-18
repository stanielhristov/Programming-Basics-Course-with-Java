package exam;

import java.util.Scanner;

public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double pricePerPerson = 0;

        if (season.equals("spring")) {
            if (people <= 5) {
                pricePerPerson = 50.00;
            } else {
                pricePerPerson = 48.00;
            }
        } else if (season.equals("summer")) {
            if (people <= 5) {
                pricePerPerson = 48.50 * 0.85;
            } else {
                pricePerPerson = 45.00 * 0.85;
            }
        } else if (season.equals("autumn")) {
            if (people <= 5) {
                pricePerPerson = 60.00;
            } else {
                pricePerPerson = 49.50;
            }
        } else {
            if (people <= 5) {
                pricePerPerson = 86.00 * 1.08;
            } else {
                pricePerPerson = 85.00 * 1.08;
            }
        }
        System.out.printf("%.2f leva.", pricePerPerson * people);

    }
}