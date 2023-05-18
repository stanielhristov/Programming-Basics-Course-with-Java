package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char [] word = input.toCharArray();

        for (int i = word.length - 1; i >= 0 ; i--) {
            System.out.print(word[i]);
        }

    }
}
