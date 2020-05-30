package by.bsu.auction.resurse;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Bid extends Thread {
    private int bidNumber;
    private int price;
    private CyclicBarrier barrier;

    public Bid(int number,int price,CyclicBarrier barrier){
        this.bidNumber = number;
        this.price = price;
        this.barrier = barrier;
    }

    public int getBidNumber() {
        return bidNumber;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void run() {
        try{
            Thread.sleep((int)(Math.random()*300));
            int difference = (int)(Math.random()*100);
            price += difference;
            System.out.println("Предложение " + bidNumber + " : " + price);
            Thread.sleep((int)(Math.random()*150));
            int difference1 = (int)(Math.random()*30);
            price +=difference1;
            System.out.println("Предложение " + bidNumber + " изменилось: " + price);
            this.barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
