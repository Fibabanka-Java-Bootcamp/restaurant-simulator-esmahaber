package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();

        Waiter waiter1 = new Waiter("Waiter1", order);
        //  Waiter waiter2 = new Waiter();
       // Waiter waiter3 = new Waiter();

        Chef chef1 = new Chef(order);
        //  Chef chef2 = new Chef();



        Thread threadWaiter = new Thread(waiter1);
        threadWaiter.start();

        Thread thread1 = new Thread(chef1);
        thread1.start();

    }
}
