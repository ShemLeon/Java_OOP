package Exercices.EX1._0_Start;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean isEquilateral() {
        return a == b && c == a && b == c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public String toString() {
        return "A=" + a + " B=" + b + " C=" + c +
                (isEquilateral() ? "\nequilateral" : "\nnot equilateral");
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(12, 30, 10);
        System.out.println(t1.toString());
    }
}