package Exercices.EX1.Mivhan.E1_2025.S3;

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

        public void display(){
            System.out.println("brand: "+ this.brand+
                    "\nprice: "+ this.price);
        }
}

