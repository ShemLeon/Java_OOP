package Exercices.EX1._4_Maarah;

public class Animal {
    private String name; // Name of the animal
    private int age;     // Age of the animal
    private String type; // Type of the animal
    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public String getName() { return name;}
    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", type='" + type + "'}";
    }
}
class Zoo {
    private static final int MAX_ANIMALS = 100; // Maximum number of animals allowed
    private Animal[] animals;                  // Array to store animals
    private int count;                         // Number of animals in the zoo
    // Constructor
    public Zoo() {
        animals = new Animal[MAX_ANIMALS]; // Initialize the array
        count = 0;                         // Initial animal count
    }

    // Add an animal to the zoo
    public void addAnimal(Animal animal) {
        if (count < MAX_ANIMALS) {
            animals[count] = animal; // Add the animal to the array
            count++;                 // Increase the count
            System.out.println(animal.getName() + " was added to the zoo.");
        } else {
            System.out.println("The zoo is full. Cannot add more animals.");
        }
    }

    // Remove an animal by index
    public void removeAnimal(int index) {
        if (index >= 0 && index < count) {
            System.out.println(animals[index].getName() + " was removed from the zoo.");
            // Shift the array to the left to fill the gap from the removed item
            for (int i = index; i < count - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[count - 1] = null; // Nullify the last element of the array
            count--;                   // Decrease the count
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Return the number of animals in the zoo
    public int getAnimalCount() {
        return count;
    }

    // Display all animals using a basic for loop
    public String displayAnimals() {
        String result = "Animals in the zoo:\n";
    for (int i = 0; i < count; i++) {
        result += animals[i].toString() + "\n";
    }
    return result;
    }

    public static void main(String[] args) {
        // Create a Zoo object
        Zoo zoo = new Zoo();

        // Create Animal objects
        Animal enot = new Animal("Enot", 2, "Rakoon");
        Animal lion = new Animal("Lion", 5, "Simba");
        Animal snake= new Animal("Snake", 3, "Anakonda");

        // Add animals to the zoo
        zoo.addAnimal(enot); zoo.addAnimal(lion);  zoo.addAnimal(snake);

        // Display current list of animals
        System.out.println(zoo.displayAnimals());

        // Remove an animal by index
        zoo.removeAnimal(1);

        // Display updated list of animals
        System.out.println(zoo.displayAnimals());

        // Display the number of animals
        System.out.println("Number of animals in the zoo: " + zoo.getAnimalCount());
    }
}