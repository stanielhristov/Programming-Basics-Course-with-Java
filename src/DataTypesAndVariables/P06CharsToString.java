package DataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLetter = scanner.nextLine();
        String secondLetter = scanner.nextLine();
        String thirdLetter = scanner.nextLine();

        System.out.printf("%s%s%s", firstLetter, secondLetter, thirdLetter);
    }
}
