package org.example.service;

import org.example.model.TwoNumbersModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/sum")
public class TwoNumbersService {

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getSum(TwoNumbersModel twoNumbersModel) {
        if(twoNumbersModel.getNum1() != null && twoNumbersModel.getNum2() != null) {
            return Response.status(Response.Status.OK).entity(twoNumbersModel).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).entity("Не корректные данные!").build();
    }
}
