package forLoop;

import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length() ; i++) {
            char symbol = input.charAt(i);
            System.out.println(symbol);
            
        }
    }
}
