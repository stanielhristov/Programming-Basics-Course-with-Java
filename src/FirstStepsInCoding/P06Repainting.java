package FirstStepsInCoding;

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
//Сума за найлон: (10 + 2) * 1.50 = 18 лв.
//Сума за боя: (11 + 10%) * 14.50 = 175.45 лв.
//Сума за разредител: 4 * 5.00 = 20.00 лв.
//Сума за торбички: 0.40 лв.
//Обща сума за материали: 18 + 175.45 + 20.00 + 0.40 = 213.85 лв.
//Сума за майстори: (213.85 * 30%) * 8 = 513.24 лв.
//Крайна сума: 213.85 + 513.24 = 727.09 лв.