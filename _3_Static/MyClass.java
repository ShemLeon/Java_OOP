package Exercices.EX1._3_Static;

/* MyClass class
 * Properties:
 * 1. private int num - number
 * 2. private String name - name
 * 3. public static int found - static field for counting
 */
public class MyClass {
    private int num;
    private String name;
    public static int found;

    public MyClass(int n, String name) {
        this.num = n;
        this.name = name;
    }

    public void setNum(int n) {
        this.num = n;
    }

    public int getNum() {
        return num;
    }

    public static void print() {
        System.out.println("Printing");
    }

    /* Method to print a specific object
     * @param msg - message to print
     */
    public void print(String msg) {
        System.out.println(msg);
    }


    public static void main(String[] args) {
        MyClass a = new MyClass(1, "first");  // Constructor with int and String
        a.setNum(20);                         // Method to set the number
        a.print("Printing");                  // print method -- Printing
        MyClass.print();                      // Static print method -- Printing
        System.out.println(a.name + " " + a.getNum());  // Getter for num -- first 20
        System.out.println(MyClass.found);    // Static field found
    }
}
