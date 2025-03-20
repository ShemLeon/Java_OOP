package Exercices.EX1.Mivhan.E1_2025;
/*
public class Device{
        protected String brand;
        private Double price;
        private String category;
        static int warrantyYears = 10;
// Constructors
        public Device(String brand, Double price){
            this.brand = brand;
            this.price = price;
        }
        public Device(String brand, Double price, String category){
            this.brand = brand;
            this.price = price;
            this.category = category;
        }
// Methods
        public String getCategory(){
            return this.category;
        }
        public int calculatePerformance(){
            return 1;
        }
        public double applyDiscount(double percentage){
            return price*percentage;
        }

        public int warrantyYears(){
            return warrantyYears = 10;
        }

        public void display(){
            System.out.println("brand: "+ this.brand+
                    "\nprice: "+ this.price);
        }
    }

public class Smartphone extends Device{
        private int cameraMP;
        public Smartphone(String brand, Double price){
            super(brand, price);
            this.cameraMP = 12;
            System.out.println("Smartphone brand: " + this.brand);
        }
        public Smartphone(int cameraMP){
            super("Generic", 999.99, "Mobile");
            this.cameraMP = cameraMP;
        }

        public int totalSpecs(){
           System.out.println(this.brand + " " + this.getCategory());
            return this.cameraMP + this.calculatePerformance();
        }

        public double applyDiscount(double percentage){
            return percentage * super.applyDiscount(0.1);
        }

        public void setWarranty(int years){
            warrantyYears = Math.min(Device.warrantyYears, years);
        }

        public void display(){
            super.display();
            System.out.println("Smartphone");
        }


    }


    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Samsung", 50.5);
        Smartphone s2 = new Smartphone(13);
        // s1.display();
        // ((Device)s1).display();
        // оно все равно пропечатает по смартфоновски. Похуй на приведение типа.


        s1.totalSpecs();
        s2.totalSpecs();
        


    }
}
*/