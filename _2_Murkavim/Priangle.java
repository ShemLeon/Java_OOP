package Exercices.EX1._2_Murkavim;


import Exercices.EX1._1_OverLoading.Point;

public class Priangle {

    private Point pointUp;
    private Point pointDown;
    public Priangle(Point pointUp, Point pointDown){
        this.pointUp=new Point(pointUp);
        this.pointDown=new Point(pointDown);
    }
    public Point getPointUp(){
        return new Point(this.pointUp);
    }

    public Point getPointDown(){
        return new Point(this.pointDown);
    }

    public Point getThirdPoint(){
        int x = this.pointUp.getX();
        int y = this.pointDown.getY();
        return new Point(x,y);
    }

    public double areaOfpriangle(){
        double base1=0, base2=0;
        Point p = this.getThirdPoint();
        base1 = this.pointUp.distance(p);
        base2 = this.pointDown.distance(p);
        return (base1*base2)/2;
    }


    public static void main(String[] args) {
        //
        System.out.println("Shalom!");
        //
    }
}
