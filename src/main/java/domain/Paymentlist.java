package domain;

import java.util.ArrayList;

public class Paymentlist {
    //This is a test class, so that the client had connection to the facade

    ArrayList<Payment> list = new ArrayList<>();

    //singleton
    private static Paymentlist paymentlist = new Paymentlist();
    private Paymentlist(){};
    public static Paymentlist getInstance(){return paymentlist;}
    //------------------------


    public void addPayment(Payment p){list.add(p);}
    public ArrayList<Payment> getPaymentList(){ return list;}


}
