package com.mySampleApplication.client.services;

import com.google.gwt.core.client.GWT;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

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
    void getText(@FormParam("msg")String msg, MethodCallback<String> callback);
}
