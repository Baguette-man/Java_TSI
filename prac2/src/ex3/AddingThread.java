package ex3;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread{
    BlockingQueue blockingQueue;
    public AddingThread (BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        String element = null;
        for (int i = 0; i < 3; i++) {
            element = "Element" + i;
            blockingQueue.add(element);
            System.out.println(element + " has been added");
        }
    }
}
