package com.aditya;

public class ForecastingTool {
    // Recursive function to calculate future value
    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return predictFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
}
