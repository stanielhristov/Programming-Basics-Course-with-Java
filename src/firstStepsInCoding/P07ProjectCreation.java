package firstStepsInCoding;

import java.util.Scanner;

public class P07ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int Final = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name, projects, Final);
    }
}
