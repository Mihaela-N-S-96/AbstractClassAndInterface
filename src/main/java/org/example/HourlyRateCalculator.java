package org.example;

public class HourlyRateCalculator implements RevenueCalculator{

    public static final double HOURLY_FEE = 100.0;
    private final double fee;

    public HourlyRateCalculator(final double fee){
        this.fee = fee;
    }

    @Override
    public double calculate(final ClientEngagement clientEngagement) {
        return clientEngagement.getHoursWorked() * HOURLY_FEE;
    }
}
