package at.ta.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(1.0, 5.0);
        calculator.addition();
        calculator.subraction();
        calculator.multiplication();
        calculator.division();

        CurrencyCalculator currencyCalculator = new CurrencyCalculator(50, 60);
        currencyCalculator.multiplication();
        currencyCalculator.resultInForeignCurreny(CurrencyCalculator.CURRENCYCODE.USD);
        currencyCalculator.amountInForeignCurrency(100.0, CurrencyCalculator.CURRENCYCODE.GBP);

        TaxCalculator taxCalculator = new TaxCalculator(100,100);
        taxCalculator.addition();
        taxCalculator.calculatorCountryTax(TaxCalculator.COUNTRYCODE.CH);

        GeoCalculator geoCalculator = new GeoCalculator(0.0,0.0);
        geoCalculator.bullet(10.0);
        geoCalculator.getQuadratSideLength(10,10);
        geoCalculator.getRectangleSideLength(10,50,10,40);

        RangeCalculator rangeCalculator = new RangeCalculator(0,0);
        rangeCalculator.getRange(50,14);
    }
}
