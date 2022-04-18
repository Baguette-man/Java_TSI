package ex4;

import java.util.Random;

public class Producer extends Thread{
    Goods goods;
    public Producer(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run(){
        for (int i = 0; i < goods.amount; i++){
            goods.produce(i);
            System.out.println("Produced: " + i);
        }
    }
}
