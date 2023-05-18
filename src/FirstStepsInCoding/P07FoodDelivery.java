package FirstStepsInCoding;

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
//Цена за пилешките менюта: 2 броя * 10.35  = 20.70
//Цена за менютата с риба: 4 броя * 12.40 = 49.60
//Цена за вегетарианските менюта: 3 броя * 8.15 = 24.45
//Обща цена на менютата: 20.70 + 49.60 + 24.45 = 94.75
//Цена на десерта: 20% от 94.75 = 18.95
//Цена на доставка: 2.50 (по условие)
//Обща цена на поръчката: 94.75 + 18.95 + 2.50 = 116.20