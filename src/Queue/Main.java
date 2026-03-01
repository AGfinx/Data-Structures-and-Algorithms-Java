package Queue;

/**
 * Driver class to test the Circular Queue implementation.
 *
 * This class demonstrates:
 * - Enqueue operation
 * - Dequeue operation
 * - Peek operation
 * - Circular behavior of the queue
 * - Handling of full and empty conditions
 */
public class Main {

    public static void main(String[] args) {

        // Create a new Queue object (capacity = 4)
        Queue queue = new Queue();

        // -------------------------------
        // Enqueue initial elements
        // -------------------------------
        queue.enqueue(12);
        queue.enqueue(1);
        queue.enqueue(11);

        // Print current queue
        queue.printQueue();   // Expected: 12 1 11


        // -------------------------------
        // Remove one element from front
        // -------------------------------
        queue.dequeue();      // Removes 12


        // -------------------------------
        // Add more elements to test circular behavior
        // -------------------------------
        queue.enqueue(14);
        queue.enqueue(21);
        queue.enqueue(8);     // This may show "Queue is Full."


        // -------------------------------
        // Peek at front element
        // -------------------------------
        System.out.println(queue.peek());  // Shows current front


        // Print queue after wrap-around
        queue.printQueue();


        // -------------------------------
        // Remove all elements
        // -------------------------------
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();  // This will throw RuntimeException (Queue is Empty)
    }
}