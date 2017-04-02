package showcase;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Path("/sample")
public class SampleEndpoint {

    @GET
    public Response getSample() {
        return Response.ok("Sample response").build();
    }
}
