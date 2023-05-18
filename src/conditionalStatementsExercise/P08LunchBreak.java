package conditionalStatementsExercise;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tvShow = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());
        double lunchTime = breakDuration / 8.0;
        double relaxTime = breakDuration / 4.0;
        double totalTime = breakDuration - lunchTime - relaxTime;
        double diff = Math.abs(totalTime - episodeDuration);

        if (totalTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvShow, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvShow, Math.ceil(diff));
        }

    }
}
//1.	Име на сериал – текст
//2.	Продължителност на епизод  – цяло число в диапазона [10… 90]
//3.	Продължителност на почивката  – цяло число в диапазона [10… 120]