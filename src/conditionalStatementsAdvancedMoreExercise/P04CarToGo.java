package conditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String type = "";
        String level = "";
        double price = 0;

        if (budget <= 100) {
            level = "Economy class";
            if (season.equals("Summer")) {
                type = "Cabrio";
                price = budget * 0.35;
            } else if (season.equals("Winter")) {
                type = "Jeep";
                price = budget * 0.65;
            }


        } else if (budget >100 && budget <= 500) {
            level = "Compact class";
            if (season.equals("Summer")) {
                type = "Cabrio";
                price = budget * 0.45;
            } else if (season.equals("Winter")) {
                type = "Jeep";
                price = budget * 0.80;
            }


        } else if (budget > 500 ) {
            level = "Luxury class";
            if (season.equals("Summer")) {
                type = "Jeep";
                price = budget * 0.90;
            } else if (season.equals("Winter")) {
                type = "Jeep";
                price = budget * 0.90;
            }
        }
        System.out.println(level);
        System.out.printf("%s - %.2f", type, price);
    }
}
