package domain;

import domain.models.Payment;

import java.util.ArrayList;
// todo: This class should be deleted as the payments will be saved in Payment microservice
public class PaymentList {
    //This is a test class, so that the client had connection to the facade

    ArrayList<Payment> list = new ArrayList<>();

    //singleton
    private static PaymentList paymentlist = new PaymentList();
    private PaymentList(){};
    public static PaymentList getInstance(){return paymentlist;}
    //------------------------


    public void addPayment(Payment p){list.add(p);}
    public ArrayList<Payment> getPaymentList(){ return list;}


}
