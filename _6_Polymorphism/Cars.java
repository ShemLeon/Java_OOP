package Exercices.EX1._6_Polymorphism;

class Par {
    private int speed;
    private String manufacturer; // היצרן שם
    private static final int SPEED_UP=5;
    private static String color = "WHITE";
    // конструктор
    public Par(String m, int s) {
        this.manufacturer = m;
        this.speed = s;
    }

    public void changeColor(String color) {
        Par.color = color; // замена статика
       // this.color = color; // или так
    }
    public void speedUp() {
        if (this.speed + SPEED_UP <= 120)
            this.speed += SPEED_UP;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "-------"+"\nCar: " + this.manufacturer +
                " Color:" + this.color + " Speed: " + this.speed;

    }
}

class SportPar extends Par{
    private boolean hasTurbo = false;
    // конструктор
    public SportPar(String m, int s, boolean t) {
        super(m,s);
        this.hasTurbo = t;
    }
    public void speedUp() {
        super.speedUp();
        super.speedUp();
        super.speedUp();
    }
    @Override
    public String toString() {
        return "Sport " + super.toString() +
                " Turbo:" + this.hasTurbo;
    }
}

class TowTruck extends Par{
    private Par carToTow;
    public TowTruck(String m, int s, Par c) {
        super(m,s);
        this.carToTow = c;
    }
    @Override
    public String toString() {
        return "TowTruck: " + this.getManufacturer() + //...line1
        " " +this.getColor() + " " + this.getSpeed();            //...line2
    }
}

class CarShop {
    public static void main(String[] args) {
        Par simpleCar = new Par("Kia", 40);
   //     System.out.println(simpleCar);

        Par speedCar = new SportPar("Bugatti", 80, true);
     //   System.out.println(speedCar);

        Par[] ourCars = new Par[4];
        ourCars[0] = new Par("Ford",55);
        //System.out.println(ourCars[0]);
        ourCars[1] = new SportPar("Ferari",80,true);
       // System.out.println(ourCars[1]);
        ourCars[2] = ourCars[1];                // ................line3
       // System.out.println(ourCars[2]);
        ourCars[3] = new TowTruck("Isuzu",80, null);
     //   System.out.println(ourCars[3]);

        // SportPar myCar = ourCars[1];     //...............line4
        SportPar myCar = (SportPar) ourCars[1];

        for (int i = 0; i < ourCars.length; i++) {
            ourCars[i].speedUp();
        }

        ourCars[2].changeColor("BLUE"); // ..........line5

        for (int i = 0; i < ourCars.length; i++) {
            System.out.println(ourCars[i]);
        }
    }}