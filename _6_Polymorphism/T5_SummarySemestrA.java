package Exercices.EX1._6_Polymorphism;

class AccountA{
    private int accountNumber = 0;
    private static int currentAccountNumber=1000;
    public AccountA(){
        currentAccountNumber--;
        this.accountNumber = currentAccountNumber;
    }

    public int getNum(){
        return this.accountNumber;
    }
}

class AccountB{
    private int accountNumber = 0;
    private int currentAccountNumber=1000;
    public AccountB(){
        this.currentAccountNumber--;
        this.accountNumber = currentAccountNumber;
    }

    public int getNum(){
        return this.accountNumber;
    }
}


public class T5_SummarySemestrA {

    public static void main(String[] args) {
        AccountA a1 = new AccountA();
        AccountA a2 = new AccountA();
        AccountB b1 = new AccountB();
        AccountB b2 = new AccountB();
        System.out.println(a1.getNum()+" "+
                        a2.getNum()+" "+
                        b1.getNum()+" "+
                        b2.getNum()
                );
    }
}