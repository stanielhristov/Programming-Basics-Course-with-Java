package nestedLoopsExercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int judges = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double sumAllGrades = 0;
        int presentationCount = 0;

        while (!presentation.equals("Finish")) {
            double sumGrades = 0;
            presentationCount++;


            for (int i = 1; i <= judges ; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrades += currentGrade;


            }

            double averageGrade = sumGrades / judges;
            sumAllGrades += sumGrades;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);




            presentation = scanner.nextLine();

        }
        System.out.printf("Student's final assessment is %.2f.", sumAllGrades/ (judges * presentationCount));

    }
}
