package Exercices.EX1._3_Static;



public class TestRunner {

    static public int succeeded;
    static public int failed;
    public TestRunner() {
    }
    public TestRunner(int s, int f) {
        succeeded=s; failed=f;
    }
    public String toString() {
        return succeeded + " " + failed;
    }
    public static void main(String[] args) {
        TestRunner tr = new TestRunner(1, 99);
        TestRunner.succeeded = 99;
        System.out.print(new TestRunner()); // 99 99
    }
}
