package Exercices.EX1._6_Polymorphism;/*
Компания по маркетингу игрушек разрабатывает проект для управления запасами игрушек в компании.
Ниже частичное определение классов в Java: Игрушка - Exercices.EX1._6_Polymorphism.Toy, игрушка для малышей - Exercices.EX1._6_Polymorphism.BabyToy,
развивающая игрушка - Exercices.EX1._6_Polymorphism.ThinkToy, игрушка-пазл - Exercices.EX1._6_Polymorphism.PazelToy

A. Реализуйте в Java конструктор в классе Exercices.EX1._6_Polymorphism.BabyToy, который использует конструктор, получающий параметры в классе Exercices.EX1._6_Polymorphism.Toy.
Б. Укажите, какой механизм объектно-ориентированного программирования проявляется в определении метода total() в
    классе Exercices.EX1._6_Polymorphism.Toy и метода total() в классе Exercices.EX1._6_Polymorphism.ThinkToy.
В. Можно ли реализовать метод total() в классе Exercices.EX1._6_Polymorphism.ThinkToy с помощью метода total() из класса Exercices.EX1._6_Polymorphism.Toy?
    Если да - реализуйте его, если нет - объясните почему.
Г. Класс Exercices.EX1._6_Polymorphism.Store представляет магазин игрушек, содержащий игрушки всех типов (Exercices.EX1._6_Polymorphism.BabyToy, Exercices.EX1._6_Polymorphism.ThinkToy, Exercices.EX1._6_Polymorphism.PazelToy).
    В магазине может быть до 30 видов игрушек. Реализуйте в Java класс Exercices.EX1._6_Polymorphism.Store, который должен включать следующие пункты:
Г.1 Конструктор класса и его свойства
Г.2 Метод, возвращающий количество babyToy в магазине
Г.3 Метод, принимающий новую игрушку и добавляющий её в магазин

D. Класс WareHouse представляет склад из 10 отсеков для игрушек, пронумерованных от 1 до 10.
D.1 Конструктор класса и его свойства
D.2 Метод, принимающий номер отсека 1-10 и возвращающий, сколько детских игрушек Exercices.EX1._6_Polymorphism.BabyToy есть в этом отсеке
D.3 Метод, принимающий номер отсека 1-10 и игрушку, добавляющий игрушку в отсек,
    при условии, что есть место для игрушки в отсеке.
D.4 Метод добавления Exercices.EX1._6_Polymorphism.Store в отсек
D.5 Метод для подсчета всех игрушек во всем складе
*/




class Toy {
    protected String nameToy;
    protected String state;
    protected int age;
    protected double price;
    protected int q;

    public Toy() {
    }

    public Toy(String nameToy, String state, int age, double price, int q) {
    }

    public double total() {
        return this.price * this.q;
    }
}
// A. Реализуйте в Java конструктор в классе Exercices.EX1._6_Polymorphism.BabyToy, который использует конструктор, получающий параметры в классе Exercices.EX1._6_Polymorphism.Toy.
class BabyToy extends Toy{
    private String mat; // игра сделана 1‑го этого материала
    // в конструкторе мы ОБЯЗАТЕЛЬНО добавляем ВСЕ аргументы супер класса и потом + свои.
    public BabyToy(String nameToy, String state, int age, double price, int q, String mat) {
        super(nameToy, state, age, price, q);
        this.mat = mat;
    }
}

// Б. Укажите, какой механизм объектно-ориентированного программирования проявляется в определении метода total() в классе Exercices.EX1._6_Polymorphism.Toy и метода total() в классе Exercices.EX1._6_Polymorphism.ThinkToy.
// В. Можно ли реализовать метод total() в классе Exercices.EX1._6_Polymorphism.ThinkToy с помощью метода total() из класса Exercices.EX1._6_Polymorphism.Toy? Если да - реализуйте его, если нет - объясните почему.
class ThinkToy extends Toy {
    private int part; // номер деталей
    private String[] mat; // материалы для запчастей игрушек
    /* если бы не было +10 (изменения) - мы бы просто унаследовали его.
   // здесь был явный ПОЛИМОРФИЗМ и НАСЛЕДОВАНИЕ
   public double total() {
       return this.price * this.q + 10;
   }   */
      // Конструктор
    public ThinkToy(String nameToy, String state, int age, double price, int q, int part, String[] mat) {
        super(nameToy, state, age, price, q);  // вызываем конструктор родителя
        this.part = part;
        this.mat = mat;
    }
    @Override
    public double total(){
        return super.total()+10;
    }
}
class PazelToy extends Toy{
    private int part; // количество частей
    private String mat; // материал
    private String type; // комикс, фотки и тд
    // Конструктор
    public PazelToy(String nameToy, String state, int age, double price, int q, int part, String mat, String type) {
        super(nameToy, state, age, price, q);  // вызываем конструктор родителя
        this.part = part;
        this.mat = mat;
        this.type = type;
    }
}

// Г. Класс Exercices.EX1._6_Polymorphism.Store представляет магазин игрушек, содержащий игрушки всех типов (Exercices.EX1._6_Polymorphism.BabyToy, Exercices.EX1._6_Polymorphism.ThinkToy, Exercices.EX1._6_Polymorphism.PazelToy).
// в магазине может быть до 30 видов игрушек.
// Г.1 Конструктор класса и его свойства
// Г.2 Метод, возвращающий количество babyToy в магазине
// Г.3 Метод, принимающий новую игрушку и добавляющий её в магазин

class Store {
    public Toy[] toys;
    private int count;
// Г.1 Конструктор класса и его свойства
    public Store () {
        toys = new Toy[30]; // максимум 30 игрушек
        count = 0;    }
    // Подсчет определенного типа игрушек
// Г.2 Метод, возвращающий количество babyToy в магазине
    public int countBabyToys(){
        int babyCount = 0;
        for (int i=0; i<count; i++){
            if (toys[i] instanceof BabyToy) {
                babyCount++;
            }        }
        return babyCount;    }

// Г.3 Метод, принимающий новую игрушку и добавляющий её в магазин
    public void addToy(Toy toy){
        if (count<30){ // проверка или есть место
            toys[count] = toy;
            count++; // когда добавили - увеличиваем свойство класса count на 1.
        }else {
            System.out.println("Exercices.EX1._6_Polymorphism.Store full");
        }    }}

/*
D. Класс WareHouse представляет склад из 10 отсеков для игрушек, пронумерованных от 1 до 10.
D.1 Конструктор класса и его свойства
D.2 Метод, принимающий номер отсека 1-10 и возвращающий, сколько детских игрушек Exercices.EX1._6_Polymorphism.BabyToy есть в этом отсеке
D.3 Метод, принимающий номер отсека 1-10 и игрушку, добавляющий игрушку в отсек,
при условии, что есть место для игрушки в отсеке.
D.4 Метод добавления Exercices.EX1._6_Polymorphism.Store в отсек
D.5 Метод для подсчета всех игрушек во всем складе
 */
class Warehouse{
    private Store[] sections;    // массив отсеков, в каждом отсеке массив игрушек
    private int MAX_SECTIONS = 10; // всегда 10 отсеков

    // D.1. Конструктор класса и его свойства
    public Warehouse() {
        sections = new Store[MAX_SECTIONS];
        // изначально все отсеки пустые (null)
    }

    // D.2 Метод, принимающий номер отсека 1-10 и возвращающий, сколько детских игрушек Exercices.EX1._6_Polymorphism.BabyToy есть в этом отсеке
    public int countBabyToys(int sectionNumber){
        if (sectionNumber<1 || sectionNumber > MAX_SECTIONS) return -1 ;
        int index = sectionNumber-1; // преобразуем номер 1-10 в индекс 0-9
        if (sections[index] == null) return -1;
        return sections[index].countBabyToys();
    }

    // D.3. Метод, принимающий номер отсека 1-10 и игрушку, добавляющий игрушку в отсек,
    // при условии, что есть место для игрушки в отсеке.
    public void addToMahsanStore(int NUM,Toy toy){
        if (NUM<1 || NUM >10)
            System.out.println("ERROR - check num");
        sections[NUM-1].addToy(toy);
    }

    // D.4. Метод добавления Exercices.EX1._6_Polymorphism.Store в отсек
    public boolean addStoreToSection(int sectionNumber, Store store) {
        // Проверяем корректность номера отсека
        if(sectionNumber < 1 || sectionNumber > MAX_SECTIONS) {
            System.out.println("Invalid section number");
            return false;
        }
        int index = sectionNumber - 1;
        // Проверяем, свободен ли отсек
        if(sections[index] == null) {
            sections[index] = store;
            return true;
        } else {
            System.out.println("Section " + sectionNumber + " is already occupied");
            return false;
        }
    }

    // D.5 Метод для подсчета всех игрушек во всем складе
    public int countAllToysInWarehouse() {
        int totalToys = 0;
        for(int i = 0; i < MAX_SECTIONS; i++) {
            if(sections[i] != null) {
                // Для каждого Exercices.EX1._6_Polymorphism.Store считаем ненулевые элементы в массиве toys
                for(int j = 0; j < sections[i].toys.length; j++) {
                    if(sections[i].toys[j] != null) {
                        totalToys++;      }      }       }
        }
        return totalToys;    }
}

public class T2_SummarySemestrA {
    public static void main(String[] args) {
        // Создаем склад
        Warehouse warehouse = new Warehouse();
        
        // Создаем несколько магазинов
        Store store1 = new Store();
        Store store2 = new Store();
        
        // Создаем разные игрушки
        BabyToy babyToy1 = new BabyToy("Кукла", "Новая", 3, 29.99, 5, "Пластик");
        BabyToy babyToy2 = new BabyToy("Мячик", "Новый", 1, 15.50, 10, "Резина");
        String[] materials = {"plastic", "metal"};
        ThinkToy thinkToy = new ThinkToy("Smart Puzzle", "New", 5, 50.0, 1, 10, materials);
        PazelToy pazelToy = new PazelToy("Космос", "Новый", 7, 45.0, 1, 1000, "Фото", "ololo");
        
        // Добавляем игрушки в первый магазин
        store1.addToy(babyToy1);
        store1.addToy(babyToy2);
        
        // Добавляем игрушки во второй магазин
        store2.addToy(thinkToy);
        store2.addToy(pazelToy);
        
        // Добавляем магазины в разные секции склада
        warehouse.addStoreToSection(1, store1);
        warehouse.addStoreToSection(2, store2);
        
        // Тестируем функционал
        System.out.println("Количество детских игрушек в секции 1: " + warehouse.countBabyToys(1));
        System.out.println("Количество детских игрушек в секции 2: " + warehouse.countBabyToys(2));
        System.out.println("Общее количество игрушек на складе: " + warehouse.countAllToysInWarehouse());
        
        // Пробуем добавить игрушку в существующую секцию
        BabyToy babyToy3 = new BabyToy("Погремушка", "Новая", 0, 10.99, 3, "Пластик");
        warehouse.addToMahsanStore(1, babyToy3);
        
        // Проверяем обновленное количество
        System.out.println("\nПосле добавления новой игрушки:");
        System.out.println("Количество детских игрушек в секции 1: " + warehouse.countBabyToys(1));
        System.out.println("Общее количество игрушек на складе: " + warehouse.countAllToysInWarehouse());
    }
}
