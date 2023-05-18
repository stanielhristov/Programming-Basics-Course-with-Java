package ConditionalStatementsMoreExercises;
import java.util.Scanner;


public class P07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String fuelType = scanner.nextLine();
        int litres = Integer.parseInt(scanner.nextLine());

        if (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas")) {
            if (litres >= 25) {
                System.out.println("You have enough " + fuelType.toLowerCase() + ".");
            } else if (litres < 25) {
                System.out.println("Fill your tank with " + fuelType.toLowerCase()+ "!");
            }
        } else System.out.println("Invalid fuel!");
    }
}
 