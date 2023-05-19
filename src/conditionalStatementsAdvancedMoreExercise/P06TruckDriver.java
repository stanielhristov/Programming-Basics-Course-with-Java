package conditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());
        double moneyPerKilometer = 0;
        double totalMoney = 0;
        double totalMoneyAfterTax = 0;

        if (season.equals("Spring") || season.equals("Autumn")) {
            if (kilometers <= 5000) {
                moneyPerKilometer = 0.75;
            } else if (kilometers > 5000 && kilometers <= 10000) {
                moneyPerKilometer = 0.95;
            } else if (kilometers > 10000 && kilometers <= 20000) {
                moneyPerKilometer = 1.45;
            }
        } else if (season.equals("Summer")) {
            if (kilometers <= 5000) {
                moneyPerKilometer = 0.90;
            } else if (kilometers > 5000 && kilometers <= 10000) {
                moneyPerKilometer = 1.10;
            } else if (kilometers > 10000 && kilometers <= 20000) {
                moneyPerKilometer = 1.45;
            }
        } else if (season.equals("Winter")) {
            if (kilometers <= 5000) {
                moneyPerKilometer = 1.05;
            } else if (kilometers > 5000 && kilometers <= 10000) {
                moneyPerKilometer = 1.25;
            } else if (kilometers > 10000 && kilometers <= 20000) {
                moneyPerKilometer = 1.45;
            }
        }
        totalMoney = (kilometers * moneyPerKilometer) * 4;
        totalMoneyAfterTax = totalMoney - totalMoney * 0.10;

        System.out.printf("%.2f", totalMoneyAfterTax);

    }
}
