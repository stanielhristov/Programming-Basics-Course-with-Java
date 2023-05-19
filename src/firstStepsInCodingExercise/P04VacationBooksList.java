package firstStepsInCodingExercise;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesTotal = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int totalTime = pagesTotal / pagesPerHour;
        int hoursNeeded = totalTime / days;

        System.out.println(hoursNeeded);

    }
}
