package at.ta.Calculator;

public class TaxCalculator extends Calculator {
    public enum COUNTRYCODE {AT,CH,DE};

    public TaxCalculator(double number1, double number2) {
        super(number1, number2);
    }

    public double calculatorCountryTax (COUNTRYCODE countrycode){
        double result = getResult();
        double tax = 0.0;
        double totalAmount = 0.0;
        switch (countrycode){
            case AT:
                tax = result *0.2;
                totalAmount= result +tax;
                System.out.println("Die MWST für Österreich beträgt: "+ tax);
                System.out.println("Der Gesamtbetrag beträgt: "+totalAmount);
                System.out.println();
                break;
            case CH:
                tax = result *0.077;
                totalAmount= result +tax;
                System.out.println("Die MWST für Schweiz beträgt: "+ tax);
                System.out.println("Der Gesamtbetrag beträgt: "+totalAmount);
                System.out.println();
                break;
            case DE:
                tax = result *0.19;
                totalAmount= result +tax;
                System.out.println("Die MWST für Deutschland beträgt: "+ tax);
                System.out.println("Der Gesamtbetrag beträgt: "+totalAmount);
                System.out.println();
                break;
        }
        return result;
    }
}
