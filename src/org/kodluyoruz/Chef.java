package org.kodluyoruz;

import java.util.LinkedList;

public class Chef implements Runnable{
    LinkedList<String> orderList = new LinkedList<>();

    Order order;

    public Chef(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        try {
            order.setReady(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
