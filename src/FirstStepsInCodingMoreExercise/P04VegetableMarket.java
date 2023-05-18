package FirstStepsInCodingMoreExercise;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForKiloVegetables = Double.parseDouble(scanner.nextLine());
        double priceForKiloFruits = Double.parseDouble(scanner.nextLine());
        int totalKiloVegetables = Integer.parseInt(scanner.nextLine());
        int totalKiloFruits = Integer.parseInt(scanner.nextLine());

        double totalFruits = priceForKiloVegetables * totalKiloVegetables + priceForKiloFruits * totalKiloFruits;
        double euro = totalFruits / 1.94;

        System.out.printf("%.2f", euro);


    }
}

//•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
//•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
//•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
//•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]