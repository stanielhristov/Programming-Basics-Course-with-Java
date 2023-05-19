package conditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorsCount = Integer.parseInt(scanner.nextLine());
        int seniorsCount = Integer.parseInt(scanner.nextLine());
        String trackType = scanner.nextLine();
        double tax = 0;


        if (trackType.equals("trail")) {
            tax = (juniorsCount * 5.50) + (seniorsCount * 7) - (0.05*((juniorsCount * 5.50) + (seniorsCount * 7)));
        } else if (trackType.equals("cross-country") && (juniorsCount + seniorsCount) < 50) {
            tax = (juniorsCount * 8) + (seniorsCount * 9.50) - (0.05*((juniorsCount * 8) + (seniorsCount * 9.50)));
        } else if (trackType.equals("downhill")) {
            tax = (juniorsCount * 12.25) + (seniorsCount * 13.75) - (0.05*((juniorsCount * 12.25) + (seniorsCount * 13.75)));
        } else if (trackType.equals("road")) {
            tax = (juniorsCount * 20) + (seniorsCount * 21.50) - (0.05*((juniorsCount * 20) + (seniorsCount * 21.50)));
        } else if (trackType.equals("cross-country") && (juniorsCount + seniorsCount) >= 50) {
            tax = (juniorsCount * 6) + (seniorsCount * 7.125) - (0.05*((juniorsCount * 6) + (seniorsCount * 7.125)));
        }


        System.out.printf("%.2f", tax);

    }
}
