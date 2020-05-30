package by.bsu.auction;

import by.bsu.auction.resurse.Auction;
import by.bsu.auction.resurse.Bid;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Auction auction = new Auction();
        int start = auction.NewSlot();
        System.out.println("Стартовая цена: " + start);
        for (int i = 0; i < auction.BIDS_NUMBER; i++){
            int k = i+1;
            Bid thread = new Bid(k, start, auction.getBarrier());
            auction.add(thread);
            thread.start();
            thread.join(1300);
        }
        for (int i = 0 , j = auction.BIDS_NUMBER - 1; i < auction.BIDS_NUMBER; i++, j--){
            auction.remove(j);
        }
        int start2 = auction.NewSlot();
        System.out.println("Стартовая цена на этот слот: " + start2);
        for (int i = 0; i < auction.BIDS_NUMBER; i++){
            int k = i+1;
            Bid thread = new Bid(k, start2,auction.getBarrier());
            auction.add(thread);
            thread.start();
            thread.join(300);
        }
        for (int i = 0 , j = auction.BIDS_NUMBER - 1; i < auction.BIDS_NUMBER; i++, j--){
            auction.remove(j);
        }
        int start3 = auction.NewSlot();
        System.out.println("Стартовая цена на этот слот: " + start3);
        for (int i = 0; i < auction.BIDS_NUMBER; i++){
            int k = i+1;
            Bid thread = new Bid(k, start3,auction.getBarrier());
            auction.add(thread);
            thread.start();
        }
    }
}
