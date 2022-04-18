package ex4;



public class ProducerConsumerMain {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Thread producer = new Thread(new Producer(goods));
        Thread consumer = new Thread(new Consumer(goods));
        producer.start();
        consumer.start();
    }
}
