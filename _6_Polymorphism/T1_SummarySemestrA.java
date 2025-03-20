package Exercices.EX1._6_Polymorphism;

import Exercices.EX1._1_OverLoading.Date;

class Passport{
    private String name;
    private int number;
    private Date expiryDate;
    public Passport(String name, int number, Date expiryDate){
        this.name = name;
        this.number = number;
        this.expiryDate = new Date(expiryDate);
    }
    public boolean isValid(Date dateChecked){
        return dateChecked.getYear() < expiryDate.getYear() || 
               (dateChecked.getYear() == expiryDate.getYear() && 
                (dateChecked.getMonth() < expiryDate.getMonth() || 
                 (dateChecked.getMonth() == expiryDate.getMonth() && 
                  dateChecked.getDay() <= expiryDate.getDay())));
    }
    public void setExpiryDate(Date newExpiryDate){
        // установка даты (глубокое копирование)
        this.expiryDate = new Date(newExpiryDate);
    }
    Passport(Passport passport){
        // метод глубокого копирования
        this.name = passport.name;
        this.number = passport.number;
        this.expiryDate=new Date(passport.expiryDate);
    }

    @Override
    public String toString(){
        return ("Name:" +name + "\nPass. Num: " + number + "\nExp Exercices.EX1._0_Start.Date: " + expiryDate);
    }
}

class Traveler{
    private Passport passport;
    private Boolean isPaid;
    public Traveler(Passport passport, Boolean isPaid){
        this.passport = passport;
        this.isPaid = isPaid;
    }
    void pay(){
        this.isPaid = true;
    }
    boolean isPaid(){
        return isPaid;
    }
    boolean checkTravel(Date travelDate){
        // возвращает ТРУ если дата валидная и билеты проплатили
        return passport.isValid(travelDate) && isPaid();
    }

    @Override
    public String toString(){
        return passport.toString() + " \nPaid for ticket - " + (isPaid ? "Yes":"No");
    }

}
public class T1_SummarySemestrA {
    public static void main(String[] args) {
         // Создаем дату
         Date expiryDate1 = new Date(1, 1, 2024); // срок действия паспорта
         Date travelDate = new Date(1, 1, 2023);  // дата путешествия

         // Создаем паспорт
        Passport passport1 = new Passport("Leonid", 336540331, expiryDate1);

        // Создаем путешественника (без оплаты)
        Traveler trav1 = new Traveler(passport1, false);

        // Проверяем возможность путешествия до оплаты
        System.out.println("Информация о путешественнике:");
        System.out.println(trav1.toString());
        System.out.println("\nМожно путешествовать 1.1.2023 (до оплаты): " + 
        trav1.checkTravel(travelDate));
        // Оплачиваем и проверяем снова
        trav1.pay();
        System.out.println("\nМожно путешествовать 1.1.2023 (после оплаты): " + 
                      trav1.checkTravel(travelDate));
           }
    
}
