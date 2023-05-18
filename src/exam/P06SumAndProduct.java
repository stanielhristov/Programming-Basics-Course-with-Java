package exam;

import java.util.Scanner;

public class P06SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean foundIt = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b > a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {

                        if (foundIt) {
                            break;
                        }

                        int sum = a + b + c + d;
                        int product = a * b * c * d;

                        if (sum == product && n % 10 == 5) {
                            foundIt = true;
                            System.out.println("" + a + b + c + d);
                            break;
                        }

                        if (product / sum == 3 && n % 3 == 0) {
                            foundIt = true;
                            System.out.println("" + d + c + b + a);
                            break;
                        }
                    }
                }
            }
        }

        if (!foundIt) {
            System.out.println("Nothing found");
        }

    }
}
