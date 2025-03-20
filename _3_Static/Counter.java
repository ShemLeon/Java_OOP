package Exercices.EX1._3_Static;


public class Counter {


    public static int count=0;

    /* Counter class constructor
     * How it works:
     * 1. When each new object is created
     * 2. Increases the counter by 1
     */
    public Counter() {
        count++;
    }

    /* Method to get the number of created objects
     * @return number of created objects
     * The method is static because it works with a static variable
     */
    public static int getCount() {
        return count;
    }


    public static void main(String[] args) {
        // Generate a random number from 1 to 50
        int randomCount = (int)(Math.random() * 50) + 1;
        
        // Create a random number of Counter objects
        for(int i = 0; i < randomCount; i++) {
            new Counter();
        }
        
        // Output the number of created objects
        // The trick is to access the class directly because it's static
        System.out.println("Objects created: " + Counter.getCount());
    }
}
