package whileLoopExercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double money = change * 100;
        int countCoins = 0;

        while (money > 0) {

            if (money >= 200) {
                countCoins++;
                money = money - 200;

            } else if (money >= 100) {
                countCoins ++;
                money = money - 100;

            } else if (money >= 50) {
                countCoins ++;
                money = money -50;
            } else if (money  >= 20) {
                countCoins ++;
                money = money - 20;
            } else if (money >= 10) {
                countCoins ++;
                money = money - 10;
            } else if (money >= 5) {
                countCoins ++;
                money = money - 5;
            } else if (money >= 2) {
                countCoins ++;
                money = money - 2;
            } else if (money >= 1) {
                countCoins ++;
                money = money - 1;
            } else {
                break;
            }
        }

        System.out.println(countCoins);

    }
}
