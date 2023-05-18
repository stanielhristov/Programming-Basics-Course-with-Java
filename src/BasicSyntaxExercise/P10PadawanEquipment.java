package BasicSyntaxExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double lightSabersTotal = Math.ceil(studentsCount + studentsCount * 0.10) * lightSaberPrice;
        double robesTotal = robePrice * studentsCount;
        double beltTotal = (studentsCount - studentsCount/ 6) * beltPrice;
        double totalCost = lightSabersTotal + robesTotal + beltTotal;
        double diff = Math.abs(budged - totalCost);

        if (budged >= totalCost) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }




    }
}
//•	The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
//•	The count of students – integer in the range [0…100].
//•	The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
//•	The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
//•	The price of belts for a single belt – the floating-point number in the range [0.00…100.00].