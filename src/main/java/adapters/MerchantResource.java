package adapters;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import domain.DTUPayAccount;
import javax.ws.rs.core.MediaType;

@Path("/merchant")
public class MerchantResource {
    public FacadeController facadeController;
    public MerchantResource(FacadeController facadeController) {
        this.facadeController = facadeController;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void createAccount(DTUPayAccount account) {
        facadeController.publishCreateMerchant(account);
    }
}
