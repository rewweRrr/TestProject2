package com.mySampleApplication.client.services;

import com.google.gwt.core.client.GWT;
import com.mySampleApplication.shared.OrderConfirmation;
import com.mySampleApplication.shared.Response;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by rewweRrr on 20.03.2016
 */
@Path("/MyTestService")
public interface TextService extends RestService {

    class Instance {
        private static TextService instance;

        public static TextService getInstance() {
            if (instance == null)
                instance = GWT.create(TextService.class);
            return instance;
        }

    }

    @POST
    @Path("/getText")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    void getText(@FormParam("msg")String msg, MethodCallback<JSONtoString> callback);

    @GET
    @Path("/getHello")
    @Produces(MediaType.APPLICATION_JSON)
    void getHello(MethodCallback<JSONtoString> callback);

    @POST
    @Path("/getTable")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    void getTable(OrderConfirmation request, MethodCallback<Response> callback);
//    void getTable(@FormParam("column")JSONNumber jsColumn, @FormParam("row")JSONNumber jsRow, MethodCallback<JSONArray> callback);
}
