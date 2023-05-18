package MethodsExercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        printVowelsCount(input);

    }
    public static void printVowelsCount (String input) {
        int count = 0;

        for (char symbol:input.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count ++;
            }

        }
        System.out.println(count);
    }
}
