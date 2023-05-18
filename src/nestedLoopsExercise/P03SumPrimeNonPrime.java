package nestedLoopsExercise;

import java.util.Scanner;

public class P03SumPrimeNonPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int nonPrimeSum = 0;
        int primeSum = 0;

        while (!input.equals("stop")) {
            int currentNumber = Integer.parseInt(input);

            if (currentNumber < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i < currentNumber; i++) {
                if (currentNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeSum += currentNumber;
            } else {
                nonPrimeSum += currentNumber;
            }

            input = scanner.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}
