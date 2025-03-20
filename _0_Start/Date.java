package Exercices.EX1._0_Start;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date other){
        this.year = other.year;
        this.month = other.month;
        this.day = other.day;
    }

    // Геттеры
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    // Сеттеры
    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
