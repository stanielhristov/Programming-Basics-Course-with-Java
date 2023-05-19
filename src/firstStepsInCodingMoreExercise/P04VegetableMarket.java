package firstStepsInCodingMoreExercise;

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

