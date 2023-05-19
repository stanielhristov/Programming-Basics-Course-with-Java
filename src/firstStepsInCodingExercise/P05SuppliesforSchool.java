package firstStepsInCodingExercise;

import java.util.Scanner;

public class P05SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());

        int markers = Integer.parseInt(scanner.nextLine());

        int litersPrep = Integer.parseInt(scanner.nextLine());

        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceBeforeDiscount = pens * 5.80 + markers * 7.20 + litersPrep * 1.20;
        double finalPrice = priceBeforeDiscount - (priceBeforeDiscount * percentDiscount / 100);

        System.out.println(finalPrice);
    }
}
