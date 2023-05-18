package exam;

import java.util.Scanner;

public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysMissing = Integer.parseInt(scanner.nextLine());
        int foodPrepared = Integer.parseInt(scanner.nextLine());
        double foodFirstDeer = Double.parseDouble(scanner.nextLine());
        double foodSecondDeer = Double.parseDouble(scanner.nextLine());
        double foodThirdDeer = Double.parseDouble(scanner.nextLine());

        double totalFoodNeeded = foodFirstDeer * daysMissing + foodSecondDeer * daysMissing + foodThirdDeer * daysMissing;
        double diff = Math.abs(totalFoodNeeded - foodPrepared);

        if (foodPrepared >= totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.",Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }




    }
}
