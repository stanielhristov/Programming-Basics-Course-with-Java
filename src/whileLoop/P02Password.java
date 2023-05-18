package whileLoop;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String currentPasswrod = scanner.nextLine();

        while (!currentPasswrod.equals(password)) {
            currentPasswrod = scanner.nextLine();

        }
        System.out.printf ("Welcome %s!",username );
    }
}
