package com.mySampleApplication.server;

import com.mySampleApplication.client.services.JSONtoString;
import com.mySampleApplication.shared.OrderConfirmation;
import com.mySampleApplication.shared.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

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

//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    @RequestMapping(value = "/getTable", method = RequestMethod.POST)
//    public JSONArray getTable(@FormParam("column")JSONNumber jsColumn, @FormParam("row")JSONNumber jsRow) {
//        int column = (int) jsColumn.doubleValue();
//        int row = (int) jsRow.doubleValue();
//
//
////        ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> row1 = new ArrayList<Integer>();
////        row1.add(1);
////        row1.add(row);
////        row1.add(column);
////        table.add(row1);
////        row1.clear();
//        row1.add(column);
//        row1.add(row);
//        row1.add(1);
////        table.add(row1);
//
//        JSONArray jsonArray = new JSONArray();
//        for (int i = 0; i < row1.size(); i++) {
//            jsonArray.set(i, new JSONNumber(row1.get(i)));
//        }
//
//        return jsonArray;
//    }

    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    @RequestMapping(value = "/getTable", method = RequestMethod.POST)
    public Response getTable(@RequestBody OrderConfirmation request) {
        Response response = new Response();
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(Integer.parseInt(request.getRows()));
//        ArrayList<Integer> row1 = new ArrayList<Integer>();
//        row1.add(1);
//        row1.add(row);
//        row1.add(column);
        response.setList(list);
        return response;
    }
}
