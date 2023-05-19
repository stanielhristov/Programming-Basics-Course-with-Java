package conditionalStatementsMoreExercises;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double priceMagnolias = magnolias * 3.25;
        double priceHyacinths = hyacinths * 4;
        double priceRoses = roses * 3.50;
        double priceCacti = cacti * 8;
        double totalSum = priceMagnolias + priceHyacinths + priceRoses + priceCacti;
        double totalSumAfterTax = totalSum - totalSum * 0.05;
        double diff = Math.abs(giftPrice - totalSumAfterTax);
        if (totalSumAfterTax >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }




    }
}
//•	Брой магнолии – цяло число в интервала [0 … 50]
//•	Брой зюмбюли – цяло число в интервала [0 … 50]
//•	Брой рози – цяло число в интервала [0 … 50]
//•	Брой кактуси – цяло число в интервала [0 … 50]
//•	Цена на подаръка – реално число в интервала [0.00 … 500.00]