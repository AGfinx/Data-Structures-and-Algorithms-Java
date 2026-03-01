package Queue;

public class Main {
    public static void main(String[] args){

        Queue queue = new Queue();

        queue.enqueue(12);
        queue.enqueue(1);
        queue.enqueue(11);


        queue.printQueue();
    }
}
