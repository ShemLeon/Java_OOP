package Exercices.EX1.Mivhan.E1_2025.S3;

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

        public static int what(Object[] arr){
            int sum = 0;
            int deviceCount = 0;
            
            for(Object obj : arr) {
                if(obj instanceof Device) {
                    ((Device)obj).display();
                    Device.warrantyYears += 2;
                    
                    if(obj instanceof Smartphone) {
                        sum += ((Smartphone)obj).totalSpecs();
                    } else {
                        deviceCount++;
                    }
                }
            }
            return sum + deviceCount;
        }

        public static void main(String[] args) {
            Device d1 = new Smartphone("Apple", 1200.0);
         // Smartphone s1 = (Smartphone) new Device("Samsung", 1100.0);
         // (Smartphone)d1.setWarranty(1);
            ((Smartphone)d1).setWarranty(1);
            d1.display();
            Device d2 = new Device("Google", 800.0);
            Device d3 = new Device("Samsung", 900.0);
            Smartphone s1 = new Smartphone("Xiaomi", 500.0);
            
            Object[] arr = {d1, d2, d3, s1, "test", 42};
            System.out.println("Result: " + what(arr));

            Device.warrantyYears = 3;          // Устанавливаем статическую переменную warrantyYears в 3
            Smartphone phone1 = new Smartphone("Apple", 999.99); // Создаем первый смартфон
            Smartphone phone2 = new Smartphone(32); // Создаем второй смартфон с камерой 32MP
            phone2.setWarranty(5); 
            System.out.println(phone1.warrantyYears); // 3

        }
}
