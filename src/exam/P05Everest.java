package exam;

import java.util.Scanner;

public class P05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command  = scanner.nextLine();
        int dayCount = 1;
        int metersCounter = 5364;

        while (!command.equals("END")) {
            int meters = Integer.parseInt(scanner.nextLine());

            if (command.equals("Yes")) {
                dayCount ++;
            }

            if (dayCount > 5) {
                break;
            }

            metersCounter += meters;
            if (metersCounter >= 8848) {

                break;
            }

            command  = scanner.nextLine();
        }

        if (metersCounter >= 8848) {
            System.out.printf("Goal reached for %d days!", dayCount);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", metersCounter);
        }
    }
}
