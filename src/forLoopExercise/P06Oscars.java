package forLoopExercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());
        double totalPoints = pointsAcademy;

        for (int i = 1; i <=judges; i++) {
            String judge = scanner.nextLine();
            double pointsJudge = Double.parseDouble(scanner.nextLine());
            int length = judge.length();
            double calculatedPoints = length * pointsJudge / 2;
            totalPoints = totalPoints + calculatedPoints;

            if (totalPoints > 1250.5) {
                break;
            }


        }

        if (totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - totalPoints);
        }
    }
}
//o	Име на оценяващия - текст
//o	Точки от оценяващия - реално число в интервала [1.0... 50.0]
