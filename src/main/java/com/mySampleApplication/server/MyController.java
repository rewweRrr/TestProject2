package com.mySampleApplication.server;

import com.mySampleApplication.client.services.JSONtoString;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by rewweRrr on 20.03.2016
 */
@RestController
public class MyController {
    @RequestMapping(value = "/getText", method = RequestMethod.POST , consumes = MediaType.APPLICATION_FORM_URLENCODED, produces = MediaType.APPLICATION_JSON)
    public JSONtoString getUser(@FormParam("msg") String msg) {
        JSONtoString confirmation = new JSONtoString();
        confirmation.setMsg("POST: Client: " + msg + " Server: Hi!");
        return confirmation;
    }

    @RequestMapping(value = "/getHello",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    public JSONtoString getHello() {

        JSONtoString confirmation = new JSONtoString();
        confirmation.setMsg("GET: HELLO!");
        return confirmation;
    }

}
