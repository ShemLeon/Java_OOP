// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class GreetingCard {
    protected String recipient;
    protected String sender;

    public GreetingCard(String recipient, String sender) {
        this.recipient = recipient;
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String greetingMsg() {
        return "Best Greeting!!!";
    }

    public String toString() {
        return "Dear " + recipient + ",\n" +
               greetingMsg() + "\n" +
               sender + "\n" +
               "*****************************************";
    }


}