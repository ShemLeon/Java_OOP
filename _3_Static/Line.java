package Exercices.EX1._3_Static;


import Exercices.EX1._1_OverLoading.Point;

public class Line {
    private Point p1;
    private Point p2;
    public static int count = 0;
    // constructor
    public Line(){};
    public Line(int x1, int y1, int x2, int y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        count++;
    }

//    public static int getCount() {
//        return count;
//    }

    public static void main(String[] args) {
        Line line1 = new Line(100,100,50,150);
        Line line2 = new Line(100,100,150,150);
        System.out.println(count);  // 2
        System.out.println("No. of lines = "+ Line.count); // 2
        Line ln1 = new Line();
        System.out.println("No. of lines = "+ ln1.count); // 2
    }
}
