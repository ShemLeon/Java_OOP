package Exercices.EX1.Mivhan.E1_2025;

class A {
    public void methodA() {
        System.out.println("Метод класса A");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("Метод класса B");
    }
}

class C extends A {
    public void methodC() {
        System.out.println("Метод класса C");
    }
}

class D extends B {
    public void methodD() {
        System.out.println("Метод класса D");
    }
}

public class E1_Sheela2 {
    public static void main(String[] args) {
        // (1)
        System.out.println("Тест 1: A a1 = new C()");
        A a1 = new C(); // работает  syso:"Метод класса A"
        a1.methodA();
        // a1.methodB();  // не работает - нужно приведение типов
        ((C)a1).methodC();  // работает после приведения типа.
        // syso:"Метод класса С"

        // (2)
        System.out.println("\nТест 2: B b1 = (B)(new A())");
//      B b1 = (B)(new A());  // Ошибка - нельзя привести A к B

        // (3)
        System.out.println("\nТест 3: B b2 = new D()");
        B b2 = new D();  // работает
        b2.methodA();    // можно вызвать метод A
        b2.methodB();    // можно вызвать метод B
        ((D)b2).methodD();  // нужно привести к D чтобы вызвать methodD
//
//
//        B b2 = new D();


    }
}
