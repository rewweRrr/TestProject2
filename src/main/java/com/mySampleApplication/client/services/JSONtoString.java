package com.mySampleApplication.client.services;

/**
 * Created by rewweRrr on 21.03.2016
 */
public class JSONtoString {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

//    public interface JSONtoStringJED extends JsonEncoderDecoder<JSONtoString> {
//    }
//
//    @Override
//    public String toString() {
//        if(GWT.isClient()) {
//            JSONtoStringJED jed = GWT.create(JSONtoStringJED.class);
//            return jed.encode(this).toString();
//        }
//        return super.toString();
//    }
}
