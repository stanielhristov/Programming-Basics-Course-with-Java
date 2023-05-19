package conditionalStatementsMoreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double grapes = x * y;
        double wine = 0.40 * grapes / 2.5;
        double wineDiff = Math.abs(wine - z);
        double winePerPerson = wineDiff / workers;

        if (wine < z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineDiff));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(wineDiff), Math.ceil(winePerPerson));

        }





    }
}
//•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
//•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
//•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
//•	4ти ред: брой работници – цяло число в интервала [1 … 20]