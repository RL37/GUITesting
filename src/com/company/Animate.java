package com.company;

public class Animate implements Runnable{
    blockBreakerPanel blockBreaker;

    public Animate(blockBreakerPanel bp){
        this.blockBreaker = bp;
    }

    @Override
    public void run(){
        while(true){
            blockBreaker.update();
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
