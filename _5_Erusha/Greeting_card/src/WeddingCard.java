// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class WeddingCard extends GreetingCard {
   private String bride;
   private String groom;

    public WeddingCard(String bride, String groom, String sender) {
        super("", sender); // Initially empty recipient
        this.bride = bride;
        this.groom = groom;
        setRecipient(bride, groom); // Set the combined recipient
    }

    public void setRecipient(String bride, String groom) {
        this.bride = bride;
        this.groom = groom;
        super.setRecipient(bride + " & " + groom);
    }

    @Override
    public String greetingMsg() {
        return "May you live happily ever after";
    }

    

}