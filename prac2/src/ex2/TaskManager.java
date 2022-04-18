package ex2;


public class TaskManager {
    public synchronized void performTask(String threadName, int taskId) {
        System.out.println("Name = " + threadName);
        System.out.println("ID = " + taskId);

        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Name = " + threadName);
        System.out.println("ID = " + taskId);
    }
}
