package ex3;

import javax.lang.model.element.Element;
import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread{

    private BlockingQueue blockingQueue;
    public TakingThread(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(blockingQueue);
    }
}
