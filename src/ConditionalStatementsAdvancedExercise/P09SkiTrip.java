package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String grade = scanner.nextLine();
        double priceForHoliday = 0;

        switch (typeRoom) {
            case "room for one person":
                priceForHoliday = (days - 1) * 18;
                break;
            case "apartment":
                priceForHoliday = (days - 1) * 25;
                if (days < 10) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.30);
                } else if (days >= 10 && days <= 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.35);
                } else if (days > 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.50);
                }
                break;
            case "president apartment":
                priceForHoliday= (days - 1) * 35;
                if (days < 10) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.10);
                } else if (days >= 10 && days <= 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.15);
                } else if (days > 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.20);
                }
                break;
        }
        if (grade.equals("positive")) {
            priceForHoliday = priceForHoliday + (priceForHoliday * 0.25);
        } else if (grade.equals("negative")) {
            priceForHoliday = priceForHoliday - (priceForHoliday * 0.10);
        }
        System.out.printf("%.2f", priceForHoliday);
    }
}
//•	Първи ред - дни за престой - цяло число в интервала [0...365]
//•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
//•	Трети ред - оценка - "positive"  или "negative"