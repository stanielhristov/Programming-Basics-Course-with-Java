package whileLoop;

import java.util.Scanner;

public class P04Sequence2K1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num2 = 1 ;

        while (num2 <= num) {
            System.out.println(num2);
            num2 = num2 * 2 + 1;
        }
    }
}
