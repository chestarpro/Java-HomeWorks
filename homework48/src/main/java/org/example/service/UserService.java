package org.example.service;

import org.example.dao.impl.UserDaoImpl;
import org.example.model.UserModel;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("/user")
public class UserService {

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response authorizeUser(UserModel userModel) {
        UserModel dBUser = new UserDaoImpl().getByName(userModel.getUserName());
        if(dBUser != null) {
            try {
                if(!dBUser.getUserPassword().equals(userModel.getUserPassword()))
                    throw new IllegalAccessException("Неверный пароль!");
                else return Response.status(Response.Status.OK).entity(UUID.randomUUID()).build();
            } catch (IllegalAccessException e) {
                return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
            }
        }
        return Response.status(Response.Status.NOT_FOUND).entity("Пользователь не найден!").build();
    }
}
