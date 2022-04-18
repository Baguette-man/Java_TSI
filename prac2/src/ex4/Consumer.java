package ex4;


public class Consumer extends Thread {
    Goods goods;
    public Consumer(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run(){
        int i = 0;
        while (true) {
            goods.consume();
            i ++;
            System.out.println("Consumed: " + i);
        }
    }

}
