package com.github.bernd.dropreact.resources;

import com.google.common.collect.ImmutableMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/system-info")
@Produces(MediaType.APPLICATION_JSON)
public class SystemInfo {
    @GET
    public Response get() {
        return Response.ok(ImmutableMap.of("status", "ok")).build();
    }
}
