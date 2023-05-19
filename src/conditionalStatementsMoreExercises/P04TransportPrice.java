package conditionalStatementsMoreExercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double taxiDay = 0.70 + n * 0.79;
        double taxiNight = 0.70 + n * 0.90;
        double bus = n * 0.09;
        double train = n * 0.06;

        if (n < 20 && time.equals("day")) {
            System.out.printf("%.2f", taxiDay);
        } else if (n < 20 && time.equals("night")) {
            System.out.printf("%.2f", taxiNight);
        } else if (n >= 20 && n < 100) {
            System.out.printf("%.2f", bus);
        } else {
            System.out.printf("%.2f", train);
        }



    }
}
//•	Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000]
//•	Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта