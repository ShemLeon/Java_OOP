// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class AdultBirthday extends BirthdayCard {
   private int age;

    public AdultBirthday (String recipient, String sender, int age) {
        super(recipient, sender, age);
        this.age = age;
          }

    @Override
    public String greetingMsg() {
        return "Happy "+ age +" Birthday! How you have grown!\n You haven't changed at all!";
    }

    

}