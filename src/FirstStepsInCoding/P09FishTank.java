package FirstStepsInCoding;

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
//обем на аквариумa: 85 * 75 * 47 = 299625 см3
//обем в литри: 299625 * 0.001 или  299625 / 1000 => 299.625 литра
//заето пространство: 17% = 0.17
//нужни литри: 299.625 * (1 - 0.17) = 248.68875 литра