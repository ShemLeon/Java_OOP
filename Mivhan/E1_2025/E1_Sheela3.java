package Exercices.EX1.Mivhan.E1_2025;
public class E1_Sheela3 {

    public static class Tav{
        protected char t1;
        public Tav(){
            // благодаря пустому конструктору можно наследовать без
            // обязательного обозначения (super)
        }
        public Tav(char s){
            this.t1 = s;
        }
        public void print(){
            System.out.println(this.t1);
        }
    }

    public static class TwoTav extends Tav{
        protected char t2;
        public TwoTav(char s1, char s2){
            super(s1);
            this.t2 = s2;
        }
        public void print(){
            super.print();
            System.out.println(this.t2);
        }
    }

    public static class MultyTav extends Tav {
        private int count = 0;
        private Tav[] arrayTavim;

        public MultyTav() {
            this.arrayTavim = new Tav[5];
        }

        public void print() {
            for (int i = 0; i < count; i++) {
                arrayTavim[i].print();
            }
        }

        public void add(Tav t) {
            arrayTavim[count] = t;
            count++;
        }
    }

    public static void main(String[] args) {
        MultyTav tavim = new MultyTav();
        Tav t = new TwoTav('A', 'B');
        tavim.add(t); // A B

        t = new Tav('C');
        tavim.add(t); // A B, C

        t = new TwoTav('C', 'D');
        tavim.add(t);   // A B, C, C D

        t = new TwoTav('E', 'F');
        tavim.add(t); // A B, C ,C D, E F

        MultyTav subtavim = new MultyTav();
        TwoTav t2 = new TwoTav('G', 'H');
        subtavim.add(t2); // G H
        t=t2;

        subtavim.add(t2); // G H, G H, F G
        t=new TwoTav('F', 'G');
        subtavim.add(t);

        tavim.add(subtavim);
        tavim.print(); // [A B], [C] ,[C D], [E F], ([G H], [G H], [F G])
        // в итоге будет 5 итемов в массиве. но итемы не "соло буквы" - а объекты
        // если бы было переполнение - была бы ошибка.
    }
}
