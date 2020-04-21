package at.ta.Calculator;

public class Calculator {
    private double number1;
    private double number2;
    private double result;


    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    public void addition() {
        this.result = this.number1 + this.number2;
        System.out.println(getNumber1() + "+" + getNumber2() + "=" + getResult());
        System.out.println();
    }

    public void subraction() {
        this.result = this.number1 - this.number2;
        System.out.println(getNumber1() + "-" + getNumber2() + "=" + getResult());
        System.out.println();
    }

    public void multiplication() {
        this.result = this.number1 * this.number2;
        System.out.println(getNumber1() + "*" + getNumber2() + "=" + getResult());
        System.out.println();
    }

    public void division() {
        this.result = this.number1 / this.number2;
        System.out.println(getNumber1() + ":" + getNumber2() + "=" + getResult());
        System.out.println();
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
