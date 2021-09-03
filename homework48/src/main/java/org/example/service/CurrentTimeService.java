package org.example.service;

import org.example.model.CurrentTimeModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/current-time")
public class CurrentTimeService {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public CurrentTimeModel getCurrentTime() {
        return new CurrentTimeModel();
    }
}
