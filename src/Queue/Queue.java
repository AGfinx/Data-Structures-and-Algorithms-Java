package Queue;

/**
 * A simple Circular Queue implementation using an array.
 *
 * - FIFO (First In First Out)
 * - Fixed capacity of 4
 * - Uses modulo operator for circular behavior
 */
public class Queue {

    private int front = 0;      // Points to first element
    private int rear = -1;      // Points to last element
    private int size = 0;       // Current number of elements
    private final int[] arr = new int[4];  // Fixed capacity array

    /**
     * Adds an element to the rear of the queue.
     */
    public void enqueue(int data) {
        if (!isFull()) {
            rear = (rear + 1) % arr.length;
            arr[rear] = data;
            size++;
        } else {
            System.out.println("Queue is Full.");
        }
    }

    /**
     * Removes and returns the front element.
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }

        int data = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return data;
    }

    /**
     * Returns the front element without removing it.
     */
    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is Empty");

        return arr[front];
    }

    /**
     * Prints elements in queue order.
     */
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return;
        }

        for (int i = 0; i < size; i++) {
            int index = (front + i) % arr.length;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    /**
     * Checks if queue is full.
     */
    private boolean isFull() {
        return size == arr.length;
    }

    /**
     * Checks if queue is empty.
     */
    private boolean isEmpty() {
        return size == 0;
    }
}