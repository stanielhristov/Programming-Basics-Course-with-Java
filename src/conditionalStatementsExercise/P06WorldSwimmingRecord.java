package conditionalStatementsExercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSecs = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSecs = Double.parseDouble(scanner.nextLine());
        double totalTime = distance * timeInSecs;
        double timeSlowed = (distance / 15) * 12.5;
        double totalTimeTwo = totalTime + timeSlowed;

        if (totalTimeTwo > recordInSecs ) {
            System.out.printf ("No, he failed! He was %.2f seconds slower.",Math.abs(recordInSecs - totalTimeTwo));
        } else {
           System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeTwo);
        }


    }
}
