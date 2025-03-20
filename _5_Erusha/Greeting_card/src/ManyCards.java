// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5
public class ManyCards {
    public static void main(String[] args) {

        // Create an array of GreetingCard to hold different types of cards
        GreetingCard[] cards = new GreetingCard[6];
        cards[0] = new GreetingCard("Yossi", "Izik");
        cards[1] = new BirthdayCard("Gennadiy", "Valentin", 5);
        cards[2] = new WeddingCard("Petr", "Oksana", "Ester");
        cards[3] = new AdultBirthday ("Joe","Ann", 50);
        cards[4] = new GreetingCard ("Debby", "Bob");
        cards[5] = new WeddingCard ("Joe", "Ann", "Debby");

        // Loop through and print all cards
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
            System.out.println("*****************************************");
        }

    }
}