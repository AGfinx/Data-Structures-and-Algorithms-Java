package Queue;

public class Main {
    public static void main(String[] args){

        Queue queue = new Queue();

        queue.enqueue(12);
        queue.enqueue(1);
        queue.enqueue(11);
        queue.printQueue();


        queue.dequeue();
        queue.enqueue(14);
        queue.enqueue(21);
        queue.enqueue(8);


        System.out.println(queue.peek());
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }
}
