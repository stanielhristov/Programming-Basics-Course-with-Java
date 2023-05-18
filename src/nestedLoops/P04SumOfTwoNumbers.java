package nestedLoops;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinationCounter = 0;
        boolean isValid = false;


        for (int i = num1; i <=num2 ; i++) {
            for (int j = num1; j <=num2 ; j++) {
                combinationCounter ++;
                int sum = i + j;
                if (sum == magicNumber) {
                    isValid = true;
                    System.out.printf("Combination N:%d ", combinationCounter);
                    System.out.printf("(%d + %d = %d)%n", i, j, sum);
                    break;

                }


            }
            if (isValid) {
                break;

            }
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNumber);
        }




    }
}
//•	Първи ред – начало на интервала – цяло число в интервала [1...999]
//•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
//•	Трети ред – магическото число – цяло число в интервала [1...10000]