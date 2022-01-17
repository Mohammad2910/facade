package adapters;

import domain.models.Payment;
import domain.PaymentList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/payment")
public class PaymentResource {

    private PaymentList p = PaymentList.getInstance();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void initiatePayment(Payment payment){
        p.addPayment(payment);
    }

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Payment> getlist(){return p.getPaymentList();}
}