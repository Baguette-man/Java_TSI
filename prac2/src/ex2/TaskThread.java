package ex2;

public class TaskThread extends Thread{
    String threadName;
    int taskId;
    TaskManager taskManager;

    public TaskThread(String threadName, int taskId, TaskManager taskManager) {
        this.threadName = threadName;
        this.taskId = taskId;
        this.taskManager = taskManager;
    }

    @Override
    public void run() {
        taskManager.performTask(threadName, taskId);
    }
}
