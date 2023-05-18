package ConditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String yesOrNo = scanner.nextLine();
        double priceChrysanthemums = 0;
        double priceRoses = 0;
        double priceTulips = 0;
        double fullPrice = priceChrysanthemums + priceRoses + priceTulips;



        double totalPrice = 0;


        if (season.equals("Spring") || season.equals("Summer")) {
            priceChrysanthemums = 2 * chrysanthemums;
            priceRoses = 4.10 * roses;
            priceTulips = 2.50 * tulips;
        } else if (season.equals("Аutumn") || season.equals("Winter")) {
            priceChrysanthemums = 3.75 * chrysanthemums;
            priceRoses = 4.50 * roses;
            priceTulips = 4.15 * tulips;
        }
         if (yesOrNo.equals("Y")) {
            priceChrysanthemums = priceChrysanthemums + priceChrysanthemums * 0.15;
            priceRoses = priceRoses + priceRoses * 0.15;
            priceTulips = priceTulips + priceTulips * 0.15;
        }
         if (season.equals("Spring") && tulips > 7) {
             fullPrice = fullPrice - fullPrice * 0.05;

         } else if (season.equals("Winter") && roses >= 10) {
             fullPrice = fullPrice - fullPrice * 0.10;
         } else if (chrysanthemums + roses + tulips > 20) {
             fullPrice = fullPrice - fullPrice * 0.20;

         }
         fullPrice = priceChrysanthemums + priceRoses + priceTulips;

         double finalPrice = fullPrice + 2;
         System.out.printf("%.2f", finalPrice);



    }
}
//•	На първия ред е броят на закупените хризантеми – цяло число в интервала [0 ... 200]
//•	На втория ред е броят на закупените рози – цяло число в интервала [0 ... 200]
//•	На третия ред е броят на закупените лалета – цяло число в интервала [0 ... 200]
//•	На четвъртия ред е посочен сезона – [Spring, Summer, Аutumn, Winter]
//•	На петия ред е посочено дали денят е празник – [Y – да / N - не]