package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());
        int playingNormalDay = (365 - holidays) * 63;
        int playingHoliday = holidays * 127;
        int totalPlayingTime = playingNormalDay + playingHoliday;
        int diff = Math.abs(30000 - totalPlayingTime);
        int totalTimeInHours = diff / 60;
        int totalTimeInMinutes = diff % 60;

        if (totalPlayingTime > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", totalTimeInHours, totalTimeInMinutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", totalTimeInHours, totalTimeInMinutes);
        }







    }
}
