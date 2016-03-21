package com.mySampleApplication.shared;

/**
 * Created by rewweRrr on 21.03.2016
 */
public class OrderConfirmation {
    private String rows;

    public void setRows(String rows) {
        this.rows = rows;
    }

    public String getRows() {
        return rows;
    }

    public OrderConfirmation(String rows) {
        this.rows = rows;
    }

    public OrderConfirmation() {
    }
}
