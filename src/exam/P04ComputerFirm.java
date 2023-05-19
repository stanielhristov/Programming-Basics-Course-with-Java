package exam;

import java.util.Scanner;

public class P04ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computersCount = Integer.parseInt(scanner.nextLine());
        int ratingSum = 0;
        double salesSum = 0;

        for (int i = 1; i <=computersCount ; i++) {
            int currentComputer = Integer.parseInt(scanner.nextLine());

            int rating = currentComputer % 10;
            ratingSum += rating;

            int sales = currentComputer / 10;

            double percentage = 0;
            switch (rating) {
                case 2:
                    percentage = 0;
                    break;
                case 3:
                    percentage = 0.5;
                    break;
                case 4:
                    percentage = 0.7;
                    break;
                case 5:
                    percentage = 0.85;
                    break;
                case 6:
                    percentage = 1;
                    break;

            }
            salesSum += sales * percentage;
        }

        System.out.printf("%.2f%n", salesSum);
        System.out.printf("%.2f", ratingSum * 1.0 / computersCount);
    }
}
