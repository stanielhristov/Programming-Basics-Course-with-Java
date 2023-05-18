package exam;

import java.util.Scanner;

public class P01PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceCPU = Double.parseDouble(scanner.nextLine()) * 1.57;
        double priceGPU = Double.parseDouble(scanner.nextLine()) * 1.57;
        double priceRAM = Double.parseDouble(scanner.nextLine()) * 1.57;
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());


        double discountCPU = priceCPU - (priceCPU * discount);
        double discountGPU = priceGPU - (priceGPU * discount);
        double totalPriceRAM = priceRAM * ramCount;
        double totalPrice = discountCPU + discountGPU + totalPriceRAM;
        System.out.printf("Money needed - %.2f leva.", totalPrice);



    }
}

