package whileLoop;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum =0;

        while (sum < num) {
            currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;
        }
        System.out.println(sum);
    }
}
