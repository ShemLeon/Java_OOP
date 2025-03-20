package Exercices.EX1._0_Na4alo;

public class Clock {
    private int hour;
    private int minutes;
    
    public Clock(int hour, int minutes){
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public boolean assertHour(Clock c1, Clock c2){
        return c1.getHour() == c2.getHour();
    }

    public int pereshMinutes(Clock c1, Clock c2){
        return Math.abs(c1.getHour()*60 + c1.getMinutes() - c2.getHour()*60 - c2.getMinutes());
    }

    public String toString(){
        return "<" + hour + ":" + minutes + ">";
    }

    public static void main(String[] args) {
        Clock c1 = new Clock(12, 30);
        Clock c2 = new Clock(12, 45);
        Clock c3 = new Clock(14, 20);


        System.out.println(c1.assertHour(c1, c2));
        System.out.println(c1.assertHour(c1, c3));

        System.out.println(c1.pereshMinutes(c1, c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        char a = '5';
        double b = 6.0;
         if (a>b) System.out.println("TRUEEE");
         if (a<b) System.out.println("TRUEEE");
    }

    }
