package InterfacesAndAbstractionExercisesFoodShortage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> nameByBuyers = new HashMap<>();
        Buyer buyer;

        for (int i = 0; i < numberOfPeople; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            if (parts.length == 3) {
                String group = parts[2];
                buyer = new Rebel(name, age, group);
            } else {
                String id = parts[2];
                String birthDate = parts[3];
                buyer = new Citizen(name, age, id, birthDate);
            }
            nameByBuyers.put(name, buyer);

        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            if (nameByBuyers.containsKey(input)) {
                nameByBuyers.get(input).buyFood();
            }
            input = scanner.nextLine();
        }
        int sumOfFood = nameByBuyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(sumOfFood);

    }
}
