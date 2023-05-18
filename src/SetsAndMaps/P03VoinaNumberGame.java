package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> deckOne = new LinkedHashSet<>();
        Set<Integer> deckTwo = new LinkedHashSet<>();

        String inputOne[] = scanner.nextLine().split(" ");
        for (int i = 0; i < inputOne.length; i++) {
            int current = Integer.parseInt(inputOne[i]);
            deckOne.add(current);
        }

        String inputTwo[] = scanner.nextLine().split(" ");
        for (int i = 0; i < inputTwo.length; i++) {
            int current = Integer.parseInt(inputTwo[i]);
            deckTwo.add(current);
        }

        for (int step = 0; step < 50; step++) {
            if (deckOne.isEmpty()) {
                break;
            } else if (deckTwo.isEmpty()) {
                break;
            }

            Integer fighterOne = deckOne.iterator().next();
            Integer fighterTwo = deckTwo.iterator().next();

            deckOne.remove(fighterOne);
            deckTwo.remove(fighterTwo);

            if (fighterOne > fighterTwo) {
                deckOne.add(fighterOne);
                deckOne.add(fighterTwo);
            } else if (fighterTwo > fighterOne) {
                deckTwo.add(fighterOne);
                deckTwo.add(fighterTwo);
            }
        }
        if (deckOne.size() > deckTwo.size()) {
            System.out.println("First player win!");
        } else if (deckTwo.size() > deckOne.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
