package whileLoopExercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isFound = false;
        int booksCounter = 0;
        String currentBook = scanner.nextLine();

        while (!currentBook.equals("No More Books")) {

            if (currentBook.equals(input)) {
                isFound = true;
                break;
            }
            booksCounter ++;
            currentBook = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", booksCounter);

        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksCounter);

        }
    }
}
