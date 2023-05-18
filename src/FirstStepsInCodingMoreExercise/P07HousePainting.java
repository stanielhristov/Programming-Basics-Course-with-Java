package FirstStepsInCodingMoreExercise;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y= Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontWall = x * x - 2.4;
        double backWall = x * x;
        double leftWall = x * y - 2.25;
        double rightWall = x * y - 2.25;
        double house = frontWall + backWall + leftWall + rightWall;
        double rectangles = 2 * (x * y);
        double triangles = 2 * (x * h * 1.0 / 2 );
        double roof = rectangles + triangles;

        double greenPaint = house / 3.4;
        double redPaint = roof / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);









    }
}


//От конзолата се четат 3 реда:
//1.	x – височината на къщата – реално число в интервала [2...100]
//2.	y – дължината на страничната стена – реално число в интервала [2...100]
//3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]