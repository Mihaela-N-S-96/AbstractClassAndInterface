package org.example;

import java.util.Arrays;
import java.util.List;

import static org.example.FixedFeeCalculator.STANDARD_FEE;
import static org.example.HourlyRateCalculator.HOURLY_FEE;
import static org.example.RoyaltyShareCalculator.ROYAL_SHARE;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!From branch1(local) to branch1");

        final List<ClientEngagement> clientEngagementsList
                = Arrays.asList(
                new ClientEngagement("Anna's Cookies", 10, 100.0),
                new ClientEngagement("Bianca' s Burgers", 8, 200.0),
                new ClientEngagement("Victor' s Doughnuts", 12, 500.0),
                new ClientEngagement("Oana' s Sausages", 7, 50.0)
        );

        RevenueCalculator calculator = new FixedFeeCalculator(STANDARD_FEE);
        printTotalRevenue(clientEngagementsList, calculator);

        calculator = new HourlyRateCalculator(HOURLY_FEE);
        printTotalRevenue(clientEngagementsList, calculator);

        calculator = new RoyaltyShareCalculator(ROYAL_SHARE);
        printTotalRevenue(clientEngagementsList, calculator);


    }

    private static void printTotalRevenue(
            final List<ClientEngagement> engagements, final RevenueCalculator revenueCalculator){

        //calculate the TOTAL revenue for all engagements
        double total = 0;

        for (ClientEngagement clientEngagement: engagements ) {
            total += revenueCalculator.calculate(clientEngagement);
        }

        System.out.println("The total is= "+ total);
    }
}