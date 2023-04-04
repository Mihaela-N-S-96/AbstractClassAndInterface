package org.example;

public class RoyaltyShareCalculator implements RevenueCalculator{

    public static final double ROYAL_SHARE = 20.0;
    private final double fee;

    public RoyaltyShareCalculator(final double fee){
        this.fee = fee;
    }

    @Override
    public double calculate (final ClientEngagement clientEngagement){
        return clientEngagement.getHoursWorked() * ROYAL_SHARE;
    }
}
