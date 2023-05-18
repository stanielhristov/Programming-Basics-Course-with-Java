package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int allFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayInGrams = Double.parseDouble(scanner.nextLine());
        double dogEaten = days * dogFoodPerDay;
        double catEaten = days * catFoodPerDay;
        double turtleEatenInKg = days * turtleFoodPerDayInGrams / 1000;
        double foodNeeded = dogEaten + catEaten + turtleEatenInKg;
        double diff = Math.abs(allFood - foodNeeded);

        if (allFood >= foodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }






    }
}
//•	Първи ред – брой дни – цяло число в интервал [1…5000]
//•	Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
//•	Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
//•	Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
//•	Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]