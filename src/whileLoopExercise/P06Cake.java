package whileLoopExercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakeSize = width * length;
        String command = scanner.nextLine();
        boolean noMoreCake = false;

        while (!command.equals("STOP")) {
           int pieces = Integer.parseInt(command);
           cakeSize = cakeSize - pieces;

           if (cakeSize <= 0) {
               noMoreCake = true;
               break;
           }
           command = scanner.nextLine();

        }
        if (noMoreCake) {
            System.out.printf ("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
        } else {
            System.out.printf ("%d pieces are left.", cakeSize);
        }
    }
}
