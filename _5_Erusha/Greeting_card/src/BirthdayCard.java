// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class BirthdayCard extends GreetingCard {
   private int age;

    public BirthdayCard(String recipient, String sender, int age) {
        super(recipient, sender);
        this.age = age;
    }

    @Override
    public String greetingMsg() {
        return "Happy " + age + "th Birthday!";
    }

    

}