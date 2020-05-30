package by.bsu.auction.resurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CyclicBarrier;

public class Auction {
    private ArrayList<Bid> bids;
    private CyclicBarrier barrier;
    public final int BIDS_NUMBER = 3;

    public CyclicBarrier getBarrier() {
        return barrier;
    }

    public Auction(){
        this.bids = new ArrayList<Bid>();
        this.barrier = new CyclicBarrier(this.BIDS_NUMBER, new Runnable() {
            @Override
            public void run() {
                Bid winner = Auction.this.defineWinner();
                System.out.println("Предложение №" + winner.getBidNumber() + ", цена :" + winner.getPrice() + " победило!");
            }
        });
    }

    public boolean add(Bid e){
        return bids.add(e);
    }

    public Bid remove(int index){
        return bids.remove(index);
    }

    public Bid defineWinner(){
        return Collections.max(bids, new Comparator<Bid>() {
            @Override
            public int compare(Bid o1, Bid o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    public int NewSlot(){
        System.out.println("Новый слот!");
        int startPrice = (int)(Math.random()*100);
        return startPrice;
    }
}
