package ex1;

public class PriorityThread extends Thread {
    String name;
    public PriorityThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println(name+ " " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}
