package firstStepsInCodingMoreExercise;

import java.util.Scanner;

public class P06FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkumriyaKilo = Double.parseDouble(scanner.nextLine());
        double priceCacaKilo = Double.parseDouble(scanner.nextLine());
        double palamudKilo = Double.parseDouble(scanner.nextLine());
        double safridKilo = Double.parseDouble(scanner.nextLine());

        int midiKilo= Integer.parseInt(scanner.nextLine());

        double pricePalamud = priceSkumriyaKilo + priceSkumriyaKilo * 0.60;
        double priceSafrid = priceCacaKilo + priceCacaKilo * 0.80;
        double sumPalamud = palamudKilo * pricePalamud;
        double sumSafrid = safridKilo * priceSafrid;
        double sumMidi = midiKilo * 7.50;
        double sum = sumPalamud + sumSafrid + sumMidi;

        System.out.printf("%.2f",sum);



    }
}


