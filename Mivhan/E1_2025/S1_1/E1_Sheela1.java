package Exercices.EX1.Mivhan.E1_2025.S1_1;

class A{
    private int x;
    // Обычный конструктор
    public A(int x){
        this.x = x;
    }

    // Конструктор глубокого копирования
    // בנאי העתקה עמוקה
    public A (A a){
        this.x = a.getX();
    // или можно a.x, так как мы находимся в том же классе
    // או אפשר a.x, כי אנחנו נמצאים באותה מחלקה     
    }

    public int getX(){
        return this.x;
        // или можно return x, тут нет "затенения"
        // או אפשר return x, אין כאן "הצללה"
    }

    public void setX(int x){
        this.x = x;
    }

    public String toString() {
        return "x: <"+this.x+">";
    }

}

class B{
    private A a;
    private int y;


    // Верный конструктор BET
    public B(A a, int y){
        this.a = a;
        this.y = y;
    }

//    // Не верный конструктор ALEF
//    public B(A a, int y){
//        this.a.setX(a.getX());
//        this.y = y;
//    }

//    //Верный конструктор GIMEL
//    public B(A a, int y){
//        this.a = new A(a);
//        this.y = y;
//    }

    public void setA(int x){
        this.a.setX(x);
    }
    public String toString(){
        return a.toString()+" y:"+this.y;
    }
}


public class E1_Sheela1 {
    public static void main(String[] args) {
        A a1 = new A(6); // x: <6>
        B b = new B(a1, 11); // x: <2> y:11
        A a2 = new A(a1); // "глубокое копирование"
        b.setA(12); // поменяло a1 на 12.
        a1.setX(36); // поменяло a1 на <36>

        System.out.println(a1); // x: <36>
        System.out.println(a2); // x: <6>
        System.out.println(b);  // x: <36> y:11

    }
}
