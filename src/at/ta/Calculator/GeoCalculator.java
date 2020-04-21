package at.ta.Calculator;

public class GeoCalculator extends Calculator {
    double pi = Math.PI;

    public GeoCalculator(double number1, double number2) {
        super(number1, number2);
        this.pi = pi;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double bullet(double radius) {
        double u = 2 * this.pi * radius;
        double v = (4 * this.pi * radius * radius * radius) / 3;
        double g = 4 * this.pi * radius * radius;
        System.out.printf("The Bullet have a scope from: %1.2f ", u);
        System.out.printf("\nA Volume from: %1.2f", v);
        System.out.printf("\nA Surface from: %1.2f", g);
        System.out.println();
        return radius;
    }

    public double getQuadratSideLength(double a, double b) {
        double rectanglePerimeter = (a + b) * 2;
        System.out.println("The quad side length are: " + rectanglePerimeter);
        System.out.println();
        return rectanglePerimeter;
    }

    public double getRectangleSideLength(double a, double b, double c, double d) {
        double rectangle = a + b + c + d;
        System.out.println("The rectangle side length are: " + rectangle);
        System.out.println();
        return rectangle;
    }

}
