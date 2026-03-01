package Queue;

public class Queue {

    private int front=0;
    private int rear=-1;
    private int size=0;
    private final int[] arr = new int[4];

    public void enqueue(int data) {
        if (!isFull()){
            rear = (rear + 1)%4;
            arr[rear] = data;
            size++;
        }
        else {
            System.out.println("Queue is Full.");
        }
    }

    public void printQueue(){
        for(int i = front; i <size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int dequeue() {
        if (isEmpty()){
            throw  new RuntimeException("Queue is Empty");
        }
        int data = arr[front];
        front = (front + 1) % 4;
        size--;
        return data;
    }

    private boolean isFull(){
        return size==4;
    }

    private boolean isEmpty(){
        return size==0;
    }

    public int peek() {
        if (isEmpty())
            throw  new RuntimeException("Queue is Empty");
        return arr[front];
    }
}
