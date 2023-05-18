package RegExExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMessages = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackersPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int messageCount = 1; messageCount <= countMessages; messageCount++) {
            String encryptedMessage = scanner.nextLine();
            String decryptedMessage = getDecryptedMessage(encryptedMessage);

            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) {
                String planetName = matcher.group("planetName");

                String attackType = matcher.group("attackType");


                if (attackType.equals("A")) {

                    attackersPlanets.add(planetName);
                } else if (attackType.equals("D")) {

                    destroyedPlanets.add(planetName);
                }
            }
        }

        System.out.println("Attacked planets: " + attackersPlanets.size());
        Collections.sort(attackersPlanets); //сортирам планетите по име
        attackersPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets); //сортирам планетите по име
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }


    private static String getDecryptedMessage(String encryptedMessage) {

        int countLetters = getSpecialLettersCount(encryptedMessage);


        StringBuilder decryptedMessage = new StringBuilder();

        for (char symbol  : encryptedMessage.toCharArray()) {
            char newSymbol = (char)(symbol - countLetters);
            decryptedMessage.append(newSymbol);
        }

        return decryptedMessage.toString();
    }

    private static int getSpecialLettersCount(String encryptedMessage) {

        int count = 0;
        for (char symbol : encryptedMessage.toCharArray()) {
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }

        return count;
    }
}