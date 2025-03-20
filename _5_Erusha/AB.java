package Exercices.EX1._5_Erusha;

class A {
    public A() {
        System.out.println("A");
    }
    public A(int i){
        System.out.println("A + Param "+i);
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }
    public B(int i){
        super(i);
        System.out.println("B + Param" + i);
    }

//    public B(int i){
//        System.out.println("B + Param" + i);
//    }
}
public class AB {

    public static void main(String[] args) {
        // Creating an object of class B
        B b1 = new B(); // A B
        B b2 = new B(5); //
    }
}
