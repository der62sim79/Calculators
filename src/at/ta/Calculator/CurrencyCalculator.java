package at.ta.Calculator;


public class CurrencyCalculator extends Calculator {
    public enum CURRENCYCODE {
        USD("Dollar"),
        CH("Franken"),
        GBP("Pfund");

        public String CurrencyName;

        CURRENCYCODE(String currencyName) {
            this.CurrencyName = currencyName;
        }
    }

    public CurrencyCalculator(double number1, double number2) {
        super(number1, number2);

    }

    public double resultInForeignCurreny(CURRENCYCODE currencycode) {
        double result = getResult();
        double exchangeCourse = getExchangeCourse(currencycode);
        double conversionValue = 0.0;
        conversionValue = result * exchangeCourse;
        System.out.println("Der Betrag: " + getResult() + "€ in " + currencycode.CurrencyName + ": " + conversionValue);
        System.out.println();
        return conversionValue;
    }

    //ersetzt die lange version eines switch case
    public double amountInForeignCurrency(double scanner, CURRENCYCODE currencycode) {
        double amount = scanner;
        double exchangeCourse = getExchangeCourse(currencycode);
        amount = amount * exchangeCourse;
        System.out.println("Der Betrag: " + scanner + "€ in " + currencycode.CurrencyName + ": " + amount);
        System.out.println();
        return amount;
    }

    //verkürzte version für switch case
    private double getExchangeCourse(CURRENCYCODE currencycode) {
        switch (currencycode) {
            case CH:
                return 1.05;
            case GBP:
                return 0.87;
            case USD:
                return 1.09;
            default:
                return 0.0;
        }
    }
}
