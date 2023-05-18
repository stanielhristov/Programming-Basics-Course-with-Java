package forLoop;

import java.util.Scanner;
import java.util.regex.Matcher;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            leftSum = leftSum + currentNum;
        }

        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            rightSum = rightSum + currentNum;
        }

//        int leftSum = 0;
//        int rightSum = 0;
//        for (int i = 1; i <= 2 * n; i++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            if (i <= n) {
//                leftSum += currentNum;
//            } else {
//                rightSum += currentNum;
//            }
//        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}