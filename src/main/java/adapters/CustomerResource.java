package adapters;

import domain.DTUPayAccount;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerResource {

    FacadeController f;

    public CustomerResource(FacadeController f) {
        this.f = f;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void createAccount(DTUPayAccount account){
        f.publishCreateCustomer(account);
    }
}
