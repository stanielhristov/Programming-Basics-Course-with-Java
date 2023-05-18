package FirstStepsInCoding;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taxBasketBall = Integer.parseInt(scanner.nextLine());
        double shoes = taxBasketBall - (taxBasketBall * 0.40);
        double equipment = shoes - (shoes * 0.20);
        double ball = equipment / 4;;
        double accessories = ball/5;
        double totalPrice = taxBasketBall + shoes + equipment + ball + accessories;

        System.out.println(totalPrice);



    }
}
//•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
//•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
//•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
//•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка