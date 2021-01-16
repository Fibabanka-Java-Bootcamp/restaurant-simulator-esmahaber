package org.kodluyoruz;

public class Order implements Runnable{
    private boolean isTaked;
    private boolean isReady;
    private boolean isDelivered;
    private Table table;

    @Override
    public void run() {

    }

    public boolean isTaked() {

        return isTaked;
    }

    public synchronized void setTaked(boolean taked) throws InterruptedException {
        System.out.println("Sipariş bekleniyor");
        notifyAll();
        System.out.println("Sipariş alındı");
        wait();
        System.out.println("Müşteri tekrar Sipariş verdi");
        isTaked = taked;
    }

    public boolean isReady() {
        return isReady;
    }

    public synchronized void setReady(boolean ready) throws InterruptedException {

        while (true){
            if(isTaked() && !ready){
                System.out.println("Sipariş hazırlanıyor");
                wait();
                ready = true;
            } else{
                Thread.sleep(100);
                System.out.println("Sipariş hazır");
                notifyAll();
                return;
            }
            isReady = ready;
        }




    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public synchronized void setDelivered(boolean delivered) throws InterruptedException {
        wait();
        if (delivered == true)
            System.out.println("Sipariş teslim edildi");
        isDelivered = delivered;
    }


}
