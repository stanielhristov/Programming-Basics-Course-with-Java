package forLoopExercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGroups = scanner.nextInt();
        int totalMembersCount = 0;
        int totalMusala = 0;
        int totalMon = 0;
        int totalKili = 0;
        int totalK2 = 0;
        int totalEverest = 0;

        for (int i = 0; i < numberOfGroups; i++) {
            int membersCount = scanner.nextInt();

            totalMembersCount += membersCount;

            if (membersCount <= 5) {
                totalMusala += membersCount;
                continue;
            }

            if (membersCount <= 12) {
                totalMon += membersCount;
                continue;
            }

            if (membersCount <= 25) {
                totalKili += membersCount;
                continue;
            }

            if (membersCount <= 40) {
                totalK2 += membersCount;
                continue;
            }

            totalEverest += membersCount;
        }

        System.out.printf("%.2f%%%n", (double) totalMusala / (double) totalMembersCount * 100.0);
        System.out.printf("%.2f%%%n", (double) totalMon / (double) totalMembersCount * 100.0);
        System.out.printf("%.2f%%%n", (double) totalKili / (double) totalMembersCount * 100.0);
        System.out.printf("%.2f%%%n", (double) totalK2 / (double) totalMembersCount * 100.0);
        System.out.printf("%.2f%%%n", (double) totalEverest / (double) totalMembersCount * 100.0);
    }
}
//•	На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
//•	За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
//Изход