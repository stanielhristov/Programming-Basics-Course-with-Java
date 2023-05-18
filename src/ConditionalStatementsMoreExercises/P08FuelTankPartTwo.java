package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P08FuelTankPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();
        double price = 0;
        if (card.equals("Yes")){
            switch (fuel) {
                case "Diesel":
                    price = quantityFuel * (2.33 - 0.12);
                    break;
                case "Gasoline":
                    price = quantityFuel * (2.22 - 0.10);
                    break;
                case "Gas":
                    price = quantityFuel * (0.93 - 0.08);
                    break;
            }
        } else{
            switch (fuel) {
                case "Diesel":
                    price = quantityFuel * 2.33;
                    break;
                case "Gasoline":
                    price = quantityFuel * 2.22;
                    break;
                case "Gas":
                    price = quantityFuel * 0.93;
                    break;

            }

        } if (quantityFuel >= 20 && quantityFuel <=25){
            price*=0.92;
            System.out.printf("%.2f lv.%n",price);
        }else if (quantityFuel >25){
            price*=0.90;
            System.out.printf("%.2f lv.%n",price);
        }else {
            System.out.printf("%.2f lv.",price);
        }
    }
}
