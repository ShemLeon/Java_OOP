package Exercices.EX1._3_Static;

public class Kids {
    private String name;    // child's name
    private int age;       // child's age
    private int place;     // child's place in the family
    private static int numChildren = 0;  // number of children

    /* Kids class constructor
     * @param name - child's name
     * @param age - child's age
     * @param place - child's place in the family
     * How it works:
     * 1. Initializes the object's fields
     * 2. Increases the child counter
     */
    public Kids(String name, int age, int place) {
        this.name = name;
        this.age = age;
        this.place = place;
        numChildren++;
    }
    /* Method to get the number of children
     * @return number of children
     */
    public static int getNumChildren() {
        return numChildren;
    }

    /* Method for string representation of a child
     * @return string with child's information
     */
    public String toString() {
        return name + " - age: " + age + ", place: " + place;
    }



    public static void main(String[] args) {
        // Create three children of the Cohen family
        Kids tal = new Kids("Tal", 16, 1);
        Kids gil = new Kids("Gil", 13, 2);
        Kids dina = new Kids("Dina", 11, 3);

        // Output information about each child
        System.out.println(tal);
        System.out.println(gil);
        System.out.println(dina);
        
        // Output the total number of children
        System.out.println("Total children: " + Kids.getNumChildren());
    }
}
