package ConditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budged = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;

        if (people >= 1 && people <= 4) {
            budged = budged - budged * 0.75;
        } else if (people >= 5 && people <= 9) {
            budged = budged - budged * 0.60;
        } else if (people >= 10 && people <= 24) {
            budged = budged - budged * 0.50;
        } else if (people >= 25 && people <= 49) {
            budged = budged - budged * 0.40;
        } else if (people >= 50) {
            budged = budged - budged * 0.25;
        }

        if (category.equals("VIP")) {
            ticketPrice = 499.99;
        } else if (category.equals("Normal")) {
            ticketPrice = 249.99;
        }


       double allTickets = ticketPrice * people;
        double diff = Math.abs(budged - allTickets);

        if (budged >= allTickets) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }





    }
}
//•	На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
//•	На втория ред е категорията – "VIP" или "Normal"
//•	На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]
//•	На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
//•	На втория ред е категорията – "VIP" или "Normal"
//•	На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]