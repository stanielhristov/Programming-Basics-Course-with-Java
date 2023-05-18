package whileLoopExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double budged = Double.parseDouble(scanner.nextLine());
        int spendCounter = 0;
        int totalDays = 0;
        boolean notSpentFiveTimesInRow = true;
        boolean notEnoughBudged = true;

        while (notSpentFiveTimesInRow && notEnoughBudged) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            totalDays ++;

            if (action.equals("spend")) {
                spendCounter++;
                budged -= money;
                if (budged < 0) {
                    budged = 0;
                }
                notSpentFiveTimesInRow = !(spendCounter == 5);
            } else {
                budged += money;
                notEnoughBudged = budged < vacationPrice;
                spendCounter = 0;
            }
        }
        if (!notSpentFiveTimesInRow) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }



    }
}
//•	Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
//•	Налични пари - реално число в интервала [0.00...25000.00]
//След това многократно се четат по два реда:
//•	Вид действие - текст с възможности "spend" и "save"
//•	Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]