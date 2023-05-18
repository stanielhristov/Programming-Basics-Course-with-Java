package nestedLoopsExercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber  = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            String currentNumber = String.valueOf(i);

            int evenSum = 0;
            int oddSum = 0;

            for (int position = 0; position < currentNumber.length(); position++) {
                if (position % 2 == 0) {
                    evenSum += currentNumber.charAt(position);
                } else {
                    oddSum += currentNumber.charAt(position);
                }
            }

            if (evenSum == oddSum) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
