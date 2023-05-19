package firstStepsInCodingMoreExercise;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double hInCm = (h * 100) - 100;
        double wInCm = w * 100;
        int seatsH = (int) Math.floor(hInCm  / 70);
        int seatsW = (int) Math.floor(wInCm / 120);

        int seats = seatsH * seatsW  - 3;

        System.out.println(seats);



    }
}
