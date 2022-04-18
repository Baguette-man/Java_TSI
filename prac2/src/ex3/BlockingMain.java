package ex3;

import javax.lang.model.element.Element;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingMain {
    public static void main(String[] args) {
        final BlockingQueue<Element> queue = new ArrayBlockingQueue<>(3);
        AddingThread addingThread = new AddingThread(queue);
        TakingThread takingThread = new TakingThread(queue);
        new Thread(addingThread).start();
        new Thread(takingThread).start();
    }
}
