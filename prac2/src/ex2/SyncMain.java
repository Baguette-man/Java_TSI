package ex2;

import ex1.PriorityThread;

public class SyncMain {

    public void sleepThread(){
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SyncMain syncMain = new SyncMain();
        final TaskManager taskmanager = new TaskManager();
        Thread taskThread1 = new TaskThread("Thread 1", 1, taskmanager);
        Thread taskThread2 = new TaskThread("Thread 2", 2, taskmanager);
        Thread taskThread3 = new TaskThread("Thread 3", 3, taskmanager);
        Thread taskThread4 = new TaskThread("Thread 4", 4, taskmanager);
        Thread taskThread5 = new TaskThread("Thread 5", 5, taskmanager);
        /*String [] threadArray = {"taskThread1"};

        for (int i = 0; i < threadArray.length; i ++) {
            threadArray[0].start();
        }

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        taskThread1.start();
        syncMain.sleepThread();
        taskThread2.start();
        syncMain.sleepThread();
        taskThread3.start();
        syncMain.sleepThread();
        taskThread4.start();
        syncMain.sleepThread();
        taskThread5.start();
    }

}
