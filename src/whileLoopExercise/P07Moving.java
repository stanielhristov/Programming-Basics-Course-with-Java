package whileLoopExercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int space = width * length * height;

        String command = scanner.nextLine();
        boolean noMoreSpace = false;

        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);
            space = space - boxes;

            if (space <= 0) {
                noMoreSpace = true;
                break;

            }
            command = scanner.nextLine();

        }
        if (noMoreSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        } else {
            System.out.printf("%d Cubic meters left.", space);
        }


    }
}
//1.	Широчина на свободното пространство - цяло число в интервала [1...1000]
//2.	Дължина на свободното пространство - цяло число в интервала [1...1000]
//3.	Височина на свободното пространство - цяло число в интервала [1...1000]
//4.	На следващите редове (до получаване на команда "Done") - брой кашони, които се пренасят в квартирата - цяло число в интервала [1...10000]
//Програмата трябва да приключи прочитането на данни при команда "Done" или ако свободното място свърши.