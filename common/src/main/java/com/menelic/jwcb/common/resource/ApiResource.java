package com.menelic.jwcb.common.resource;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.ok;


@Produces("application/json")
@Path("/api")
@Component
public class ApiResource {
    public static final String RESPONSE = "{\"greeting\":\"Hello World!\"}";
    @GET
    public Response test() {
        return ok(RESPONSE).build();
    }
}
