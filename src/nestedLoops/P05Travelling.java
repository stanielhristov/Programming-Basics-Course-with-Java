package nestedLoops;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String destination = input;
            double budged = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < budged) {
                double amount = Double.parseDouble(scanner.nextLine());
                sum = sum + amount;

            }
            System.out.printf("Going to %s!%n", destination);
            input = scanner.nextLine();
        }
    }
}
