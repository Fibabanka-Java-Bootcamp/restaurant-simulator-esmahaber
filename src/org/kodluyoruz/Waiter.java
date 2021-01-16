package org.kodluyoruz;

public class Waiter implements Runnable{
    Order order;

    public Waiter(String name, Order order) {
        super(name);
        this.order = order;
    }

    @Override
    public void run() {
        try {
            System.out.println();
            order.setTaked(false);
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
