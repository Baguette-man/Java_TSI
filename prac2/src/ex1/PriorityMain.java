package ex1;


public class PriorityMain {
    public static void main(String[] args) {
        Thread min = new PriorityThread("Min");
        Thread max = new PriorityThread("Max");
        Thread norm = new PriorityThread("Norm");
        min.start();
        max.start();
        norm.start();
    }
}
