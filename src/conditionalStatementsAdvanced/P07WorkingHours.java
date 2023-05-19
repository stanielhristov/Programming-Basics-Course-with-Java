package conditionalStatementsAdvanced;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        boolean isWorkingDay = day.equals("Monday") ||
                day.equals("Thuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday");

        boolean isWorkingHours = hour >= 10 && hour <= 18;

        if (isWorkingDay && isWorkingHours) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }


    }
}
