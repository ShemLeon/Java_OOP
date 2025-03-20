// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5
public class Main {



    public static void main(String[] args) {
        /*
        A) 
        What happened when we called toString() on a BirthdayCard object?
        The toString() method from the parent class GreetingCard is used
        However, the greetingMsg() call inside toString() uses the overridden version from BirthdayCard
        Therefore, we get the format "Dear [recipient]," and the general structure from the parent class,
        but with a personalized birthday greeting
         */
        GreetingCard card = new GreetingCard("Yossi", "Izik");
        System.out.println(card.toString());

        BirthdayCard card2 = new BirthdayCard("Gennadiy", "Valentin", 5);
        System.out.println(card2.toString());

        WeddingCard card3 = new WeddingCard("Petr", "Oksana", "Ester");
        System.out.println(card3.toString());

        /*
        B)



        */
        

        GreetingCard gc = new GreetingCard ("Debby", "Bob");
        System.out.println(gc);

        WeddingCard we = new WeddingCard ("Joe", "Ann", "Debby");
        System.out.println(we);

        AdultBirthday adultBirth = new AdultBirthday ("Joe","Ann", 50);
        System.out.println(adultBirth);
    }
}