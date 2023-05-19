package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taxBasketBall = Integer.parseInt(scanner.nextLine());
        double shoes = taxBasketBall - (taxBasketBall * 0.40);
        double equipment = shoes - (shoes * 0.20);
        double ball = equipment / 4;;
        double accessories = ball /5;
        double totalPrice = taxBasketBall + shoes + equipment + ball + accessories;

        System.out.println(totalPrice);



    }
}
