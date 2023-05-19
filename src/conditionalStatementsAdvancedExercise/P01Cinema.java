package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0;

        if (Projection.equals("Premiere")) {
            income = rows * columns * 12;
        } else if (Projection.equals("Normal")) {
            income = rows * columns * 7.5;
        } else if (Projection.equals("Discount")) {
            income = rows * columns * 5;
        }
        System.out.printf("%.2f leva", income);
    }
}
