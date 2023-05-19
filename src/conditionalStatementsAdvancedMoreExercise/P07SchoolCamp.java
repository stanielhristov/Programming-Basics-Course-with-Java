package conditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String sport = "";
        double oneNightPrice = 0;
        double totalPrice = 0;

        if (season.equals("Winter")) {
            if (group.equals("boys") || group.equals("girls")) {
                oneNightPrice = 9.60;
            } else if (group.equals("mixed")) {
                oneNightPrice = 10;
            }
        } else if (season.equals("Spring")) {
            if (group.equals("boys") || group.equals("girls")) {
                oneNightPrice = 7.20;
            } else if (group.equals("mixed")) {
                oneNightPrice = 9.50;
            }
        } else if (season.equals("Summer")) {
            if (group.equals("boys") || group.equals("girls")) {
                oneNightPrice = 15;
            } else if (group.equals("mixed")) {
                oneNightPrice = 20;
            }
        }

        if (season.equals("Winter")) {
            if (group.equals("girls")){
                sport = "Gymnastics";
            } else if (group.equals("boys")) {
                sport = "Judo";
            } else if (group.equals("mixed")) {
                sport = "Ski";
            }
        } else if (season.equals("Spring")) {
            if (group.equals("girls")) {
                sport = "Athletics";
            } else if (group.equals("boys")) {
                sport = "Tennis";
            } else if (group.equals("mixed")) {
                sport = "Cycling";
            }
        } else if (season.equals("Summer")) {
            if (group.equals("girls")) {
                sport = "Volleyball";
            } else if (group.equals("boys")) {
                sport = "Football";
            } else if (group.equals("mixed")) {
                sport = "Swimming";
            }
        }
        totalPrice = students * oneNightPrice * nights;

        if  (students >= 50) {
            totalPrice = totalPrice - totalPrice *0.50;
        } else if (students >= 20 && students < 50) {
            totalPrice = totalPrice - totalPrice * 0.15;
        } else if (students >= 10 && students < 20) {
            totalPrice = totalPrice - totalPrice * 0.05;
        }
        System.out.printf("%s %.2f lv.", sport, totalPrice);


    }
}
