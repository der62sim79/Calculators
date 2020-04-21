package at.ta.Calculator;

public class RangeCalculator extends Calculator {
    public RangeCalculator(double number1, double number2) {
        super(number1, number2);
    }

    public double getRange(double fuelAmount, double fuelConsumption) {
        double result = fuelAmount / fuelConsumption;
        result = result * 100;
        System.out.println();
        System.out.printf("The Car can cover a distance form km: %1.2f" , result);
        System.out.println();
        return result;
    }
}
