package firstStepsInCodingExercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceForNylon = (nylon + 2) * 1.50;
        double priceForPaint = (paint + 0.10) * 14.50;
        double priceForThinner = thinner * 5;
        double sumMaterials = priceForNylon + priceForPaint + priceForThinner + 0.40;
        double sumWorkers = (sumMaterials * 0.30 * 0.01) * hours;
        double total = sumMaterials + sumWorkers;

        System.out.println(total);

    }
}
