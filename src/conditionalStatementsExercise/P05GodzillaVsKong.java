package conditionalStatementsExercise;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;
        double priceForClothes = statists * clothes;
        double totalSum = decor + priceForClothes;

        if (statists > 150) {
            priceForClothes = priceForClothes - (priceForClothes * 0.10);
        } if (totalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard need %.2f leva more.", totalSum - budget);
        } else {
            System.out.println("Action");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
        }
    }
}
