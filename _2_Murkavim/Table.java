package Exercices.EX1._2_Murkavim;

public class Table {
    private int line;
    private char tur;
    public Table(int line, char tur){
        if (line < 1 || line > 7) {
            throw new IllegalArgumentException("The row must be from 1 to 7");
        }
        if (tur < 'A' || tur > 'E') {
            throw new IllegalArgumentException("The column must be from A to E");
        }
        this.line = line;
        this.tur = tur;
    }

    public int getLine() {
        return line;
    }

    public char getTur() {
        return tur;
    }



    public static void main(String[] args) {
        Table t1 = new Table(1, 'B');
        Table t2 = new Table(2, 'A');
        System.out.println(t1);


        // Create an empty class with a maximum of 5 tables
        Kita k1 = new Kita(0, new Table[0]);

        // Add tables using the addTable method
        k1.addTable(t1);
        k1.addTable(t2);
    }
}
class Kita{
    private int count;
    private Table[] t;
    public Kita(int count, Table[] t){
        if (count > 35) {
            throw new IllegalArgumentException("There can be no more than 35 tables in the class");
        }
        this.count = count;
        this.t = t;
    }
    public int howMany(){
        return count;
    }
    public boolean isOk(int n){
        return n<=35;
    }
    public void addTable(Table t){
        // Adds a new table to the array t
        // 1. Create a new array with one more element than the current one
        Table[] newT = new Table[count + 1];
        // 2. Copy all old tables
        for(int i = 0; i < count; i++) {
            newT[i] = this.t[i];
        }
        // 3. Add the new table
        newT[count] = t;
        // 4. Update the reference and counter
        this.t = newT;
        count++;
    }
}

class School {
    private int count;          // number of classes
    private Kita[] kitot;      // array of classes

    // b. constructor
    public School(int maxKitot) {
        this.kitot = new Kita[maxKitot];  // a. array initialization
        this.count = 0;                    // b. counter initialization
    }

    // c. get class by index
    public Kita getKita(int i) {
        return kitot[i];
    }

    // d. add class to the school
    public void addClass(Kita k) {
        if (count < kitot.length) {
            kitot[count] = k;
            count++;
        } else {
            throw new IllegalStateException("The school is full");
        }
    }

    // e. count all tables in the school
    public int getTotalTables() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += kitot[i].howMany();
        }
        return total;
    }

    // f. find a class for 42 students (minimum 21 tables required)
    public int findClassFor42() {
        for (int i = 0; i < count; i++) {
            if (kitot[i].howMany() >= 21) {  // 42/2 = 21 tables minimum
                return i;
            }
        }
        return -1;  // if no suitable class is found
    }
}