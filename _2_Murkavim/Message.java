package Exercices.EX1._2_Murkavim;

import Exercices.EX1._1_OverLoading.Date;

public class Message {

    private String from;
    private String to;
    private String content;
    private Date messageDate;
// BonaMaatika -
    public Message(String from, String to, String content, Date messageDate) {
        this.from = from;
        this.to = to;
        this.content = content;
        this.messageDate = new Date(messageDate);
    }

    public Date getMessageDate(){
        return new Date(this.messageDate);
    }

    public void setMessageDate(Date messageDate){
        this.messageDate.setDay(messageDate.getDay());
        this.messageDate.setMonth(messageDate.getMonth());
        this.messageDate.setYear(messageDate.getYear());
    }


    public String toString(){
        String s = "";
        s += "--"+this.messageDate.toString()+"--"+ "\n";
        s += "From:"+this.from+"\n";
        s += "To:"+this.to+"\n";
        s += this.content;
        return s;
    }
    public void reply(String rep, Date d){
        String temp = this.from;
        this.from = this.to;
        this.to = temp;
        this.setMessageDate(d);
        this.content = rep + "\n->\n"+this.content;
    }

    public void forward(String to, Date d){
        this.from = this.to;
        this.to = to;
        this.setMessageDate(d);
        this.content = "forward>>"+this.content;
    }

    public static void main(String[] args) {
       Date d = new Date(25,3,2021);
       Message m = new Message("Gidi", "Meir", "Hi! How are you?", d);
       System.out.println(m);
       d.setDay(30);

//       m.reply("All good!", d);
//       System.out.println(m);

       m.forward("Yoni", d);
       System.out.println(m);
    }
}
