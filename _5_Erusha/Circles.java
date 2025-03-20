package Exercices.EX1._5_Erusha;
import Exercices.EX1._1_OverLoading.Point;

class Circle{
    protected Point center;
    protected int radius;
    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius; // Area of the circle
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius; // Perimeter of the circle
    }

    @Override
    public String toString() {
        return "The Circle:\n" +
                "The center of the circle: (" + center.getX() + "," + center.getY() + ")\n" +
                "The radius: " + radius;
    }
}

class Cylinder extends Circle {
    protected int height;
    public Cylinder(Point center, int radius, int height) {
        super(center, radius); // Call to the superclass Circle constructor
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return (2 * super.getArea()) + (getPerimeter() * height); // Surface area
    }

    public double getVolume() {
        return super.getArea() * height; // Volume
    }
    // public double getVolume() {  -так тоже скомпилирует
    //     return getArea() * height; // Volume
    // }

    @Override
    public String toString() {
        return "The Cylinder:\n" +
               "The center of the base: (" + center.getX() + ", " + center.getY() + ")\n" +
               "The radius of the base: " + radius + "\n" +
               "Height: " + height;
    }
}

class Cone extends Cylinder {
    public Cone(Point center, int radius, int height) {
        super(center, radius, height); // Call to the superclass Cylinder constructor
    }

    @Override
    public double getArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height); // Slant height
        return (Math.PI * radius * slantHeight) + super.getArea(); // Surface area
    }

    @Override
    public double getVolume() {
        return (1.0 / 3) * super.getArea() * height; // Volume
    }

    @Override
    public String toString() {
        return "The Cone:\n" +
               "The center of the base: (" + center.getX() + ", " + center.getY() + ")\n" +
               "The radius of the base: " + radius + "\n" +
               "Height: " + height;
    }
}


public class Circles {


    public static void main(String[] args) {


        Object[] arr1 = new Object[2];
        Circle[] arr2 = new Circle[2];

        Circle circle = new Circle(new Point(1,1),5);
        Cylinder cylinder = new Cylinder (new Point(1,1),5,3);

        arr1[0] = circle;
        arr1[1] = cylinder;
        arr2[0] = circle;
        arr2[1] = cylinder;

        System.out.println(arr1[0]);
         // System.out.println(arr1[0].getArea());
        // Error occurs because the array arr1 is of type Object[], 
        // and the compiler does not know that the objects in this array have the getArea() method
        // To fix this, you need to cast the object to the Circle type.
        System.out.println(arr2[0]);
        System.out.println(arr2[0].getArea());
        System.out.println(arr2[1].getArea());
        // System.out.println(arr2[1].getVolume()); // also an error
    }
}
