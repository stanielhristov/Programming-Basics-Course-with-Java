package firstStepsInCodingExercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceForChicken = chickenMenu * 10.35;
        double priceForFish = fishMenu * 12.40;
        double priceForVegetarian = vegetarianMenu * 8.15;
        double totalPriceForMenus = priceForChicken + priceForFish + priceForVegetarian;
        double priceForDesert = totalPriceForMenus * 0.20;
        double totalPrice = totalPriceForMenus + priceForDesert + 2.50;

        System.out.println(totalPrice);
    }
}
