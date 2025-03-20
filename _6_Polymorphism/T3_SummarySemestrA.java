package Exercices.EX1._6_Polymorphism;/*
קראו בעיון את קוד המחלקות המופיעות בשאלה זו וענו על כל הסעיפים:
א. שרטטו תרשים UML המתאר את יחסי המחלקות, אין צורך לפרט את איברי המחלקות.
ב. עבור כל אחת מ 5 השורות הממוספרות בקוד כתבו אם היא:
תגרום לשגיאה או לא, הסבירו במשפט את טענתכם.
ג. עקבו אחר התוכנית ב Exercices.EX1._6_Polymorphism.CarShop וציינו מהו הפלט ? )הניחו שכל השגיאות מסעיף קודם
תוקנו(.
*/

class Car {
    private int speed;
    private String manufacturer; // היצרן שם
    private static final int SPEED_UP=5;
    private static String color = "WHITE"; // - статик, значит что если этот цвет изменится-
    // то он изменится не для конкретной тачки, а для ВСЕХ
    public Car(String m, int s) { // конструктор
        this.manufacturer = m;
        this.speed = s;
    }
    public void changeColor(String color) {
        this.color = color; // тоже дикая, но вполне себе компилируемая хуйня
    }
    // если не пересекается 120, то заплюсит +5км.
    public void speedUp() {
        if (this.speed + SPEED_UP <= 120)
            this.speed += SPEED_UP;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    /* это не сработает, потому что нет геттера на колор.
    public String toString() {
        return "Exercices.EX1._6_Polymorphism.Car " + this.manufacturer +
                " " + this.color + " " + this.speed;
    } */
    // а с этими геттерами сработает
    public String toString() {
        return "Exercices.EX1._6_Polymorphism.Car " + this.manufacturer +
                " " + this.color + " " + this.speed;
    }
    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }
}

class SportCar extends Car {
    private boolean hasTurbo = false;
    public SportCar(String m, int s, boolean t) {
        super(m,s);
        this.hasTurbo = t;
    }
    //по уму - в таких случаях надо писать @OverRide
    public void speedUp() {
        super.speedUp();
        super.speedUp();
        super.speedUp();
    }
    //по уму - в таких случаях надо писать @OverRide
    public String toString() {
        return "Sport " + super.toString() +
                " Turbo:" + this.hasTurbo;
    }}

class TowTruck extends Car {
    private Car carToTow;
    public TowTruck(String m, int s, Car c) {
        super(m,s);
        this.carToTow = c;
    }
    /* Здесь line2 не сработает, т.к. надо через геттеры на цвет и скорость
    это ИНКАПСУЛЯЦИЯ
    public String toString() {
        return "Exercices.EX1._6_Polymorphism.TowTruck: " + this.getManufacturer() +  // ...line1
        " " + this.color + " " + this.speed;            // ...line2
    } */
    public String toString() {
        return "Exercices.EX1._6_Polymorphism.TowTruck: " + this.getManufacturer() +          // ...line1
                " " + this.getColor() + " " + this.getSpeed();  // ...line2
    }
}
class CarShop {
    public static void main(String[] args) {
        Car[] ourCars = new Car[4];
        ourCars[0] = new Car("Ford",55);
        ourCars[1] = new SportCar("Ferari",80,true);
        // line3 вполне выполнит, но это хуево - будет просто 2 ссылки на 1 и тот же объект
        // по уму нужно сделать глубокое копирование.
        ourCars[2] = ourCars[1]; // ... line3
        ourCars[3] = new TowTruck("Isuzu",80,null);

        //  надо сделать явное определение типов, не выполнит.
        //  Exercices.EX1._6_Polymorphism.SportCar myCar = ourCars[1]; // ...line4
        SportCar myCar = (SportCar)ourCars[1];
        for (int i = 0; i < ourCars.length; i++) {
            ourCars[i].speedUp();
        }
        // ебанет на все тачки синий цвет, хотя указана одна.
        ourCars[2].changeColor("BLUE"); // ....line5
        for (int i = 0; i < ourCars.length; i++) {
            System.out.println(ourCars[i]);
        }
        /*
Exercices.EX1._6_Polymorphism.Car Ford BLUE 60
// была ссылка на 1 объект дважды
// там метод спидап для спортов 3 раза по 5 плюсит
Sport Exercices.EX1._6_Polymorphism.Car Ferari BLUE 110 Turbo:true -
Sport Exercices.EX1._6_Polymorphism.Car Ferari BLUE 110 Turbo:true
Exercices.EX1._6_Polymorphism.TowTruck: Isuzu BLUE 85
         */
    }}
