import com.aditya.ForecastingTool;

public class Main {
    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.08; // 8%
        int years = 5;

        double result = ForecastingTool.predictFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value (Recursive): " + result);
    }
}