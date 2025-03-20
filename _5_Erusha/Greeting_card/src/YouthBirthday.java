// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class YouthBirthday extends BirthdayCard {
   private int age;

    public YouthBirthday (String recipient, String sender, int age) {
        super(recipient, sender, age);
          }

    @Override
    public String greetingMsg() {
        return "Happy "+ age +" Birthday! How you have grown!!";
    }

    

}