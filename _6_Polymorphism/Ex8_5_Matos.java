package Exercices.EX1._6_Polymorphism;

class Plane{
    protected int engine;   // номер борта
    protected int speed;    // max скорость
    protected double weight;    // вес
    public Plane(int engine, int speed, double weight){
        this.engine = engine;
        this.speed = speed;
        this.weight = weight;
    }
    public String toString(){
        return " engine:" + engine + " speed:" + speed +" weight: "+weight;
    }
}

class HilPlane extends Plane{
    protected String type;
    public HilPlane(int engine, int speed, double weight, String type){
        super(engine, speed, weight);
        this.type=type;
    }
    public String toString(){
        return super.toString() + "type: "+type;
    }
}

class FightPlane extends Plane{
    protected String type;
    public FightPlane(int engine, int speed, double weight, String type){
       super(engine, speed, weight);
       this.type = type;
    }
    public  String toString(){
        return super.toString() + "type: "+type;
    }
}

class CargoPlane extends Plane{
    protected int maxWeight;
    public CargoPlane(int engine, int speed, double weight, int maxWeight){
        super(engine, speed, weight);
        this.maxWeight = maxWeight;
    }
}

class AirForceFleet{
    private int numPlane; // к-во самолетов в авиапарке
    public Plane[] tayeset; // массив самолетов
    public AirForceFleet(){
        this.numPlane = 0;
        tayeset = new Plane[50];
    }
    public void addPlane(Plane p){
        this.tayeset[numPlane]=p;
        this.numPlane++;
    }
}

class Test{
    public static void main(String[] args) {
        AirForceFleet natBag = new AirForceFleet();
        natBag.addPlane(new FightPlane(450, 3000, 1, "F16"));
        natBag.addPlane(new FightPlane(450, 3000, 1, "F14"));
        natBag.addPlane(new HilPlane(70, 300, 1, "Apache"));
        natBag.addPlane(new CargoPlane(45, 300, 1, 5000));
    // добавим двумя способами в эскадрилью объекты.
        Plane p1 = new Plane(45, 300, 1);
        natBag.addPlane(p1);
        CargoPlane p2 = new CargoPlane(45, 300, 1, 5000);
        HilPlane p3 = new HilPlane(45, 300, 1, "aligator");
        FightPlane p4 = new FightPlane(45, 300, 1, "stinger");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        natBag.addPlane(p1);
        natBag.addPlane(p2);
        natBag.addPlane(p3);
        natBag.addPlane(p4);

        // Подсчет типов самолетов
        int regularPlanes = 0;
        int fightPlanes = 0;
        int hilPlanes = 0;
        int cargoPlanes = 0;

        for(int i = 0; i < 50; i++) {
            if(natBag.tayeset[i] instanceof FightPlane) {
                fightPlanes++;
            } else if(natBag.tayeset[i] instanceof HilPlane) {
                hilPlanes++;
            } else if(natBag.tayeset[i] instanceof CargoPlane) {
                cargoPlanes++;
            } else if(natBag.tayeset[i] instanceof Plane) {
                regularPlanes++;
            }
        }

        // Вывод результатов.пришлось заменить public Exercices.EX1._6_Polymorphism.Plane[] tayeset с privat;
        System.out.println("В авиапарке:");
        System.out.println("Обычных самолетов: " + regularPlanes);
        System.out.println("Истребителей: " + fightPlanes);
        System.out.println("Вертолетов: " + hilPlanes);
        System.out.println("Грузовых самолетов: " + cargoPlanes);
       
        }
}