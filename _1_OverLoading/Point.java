package Exercices.EX1._1_OverLoading;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Good Copy Constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double distance(Point other) {
        double dx = this.getX() - other.getX();
        double dy = this.getY() - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "<" + this.x + ":" + this.y + ">";
    }

    public static void main(String[] args) {
        Point p1 = new Point(4, 9);
        Point p2 = p1;
        Point p3 = new Point(p1);
        p2.setX(5);
        p2.setY(8);
        System.out.println(p1);             // <5:8>
        System.out.println(p2.toString());  // <5:8>
        System.out.println(p3.toString());  // <4:9>
        // p1 and p2 point to the same object (reference assignment)
    }
}