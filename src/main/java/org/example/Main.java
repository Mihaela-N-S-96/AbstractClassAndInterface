package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!From branch1(local) to branch1");

        final ClientEngagement clientEngagement =
                new ClientEngagement("Pluralsight", 100, 15000);

        final double hourlyPrice = RevenueCalculator.price("Hourly", clientEngagement);
        System.out.println("hourlyPrice = " + hourlyPrice);

        final double fixedFeePrice = RevenueCalculator.price("FixedFee", clientEngagement);
        System.out.println("FixedPrice = " + fixedFeePrice);

        final double royalPercentage = RevenueCalculator.price("RoyalPercentage", clientEngagement);
        System.out.println("RoyalPercentage = " + royalPercentage);

    }
}