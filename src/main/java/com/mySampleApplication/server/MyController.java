package com.mySampleApplication.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by rewweRrr on 20.03.2016
 */
@RestController
@RequestMapping("/MyController")
public class MyController {
    @RequestMapping(value = "/getText", method = RequestMethod.POST , consumes = MediaType.APPLICATION_FORM_URLENCODED, produces = MediaType.APPLICATION_JSON)
    public String getUser(@FormParam("msg") String msg) {
        return "Client: " + msg + " Server: Hi!";
    }
}
