package firstStepsInCodingExercise;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int aquarium = length * width * height;
        double litters = aquarium / 1000.0;
        double neededLitters = litters - (litters * percent / 100);
        System.out.println(neededLitters);




    }
}
