package linkedlist;

/**
 * Main class to demonstrate and test the LinkedList implementation.
 *
 * This class performs:
 *  - Adding elements at end
 *  - Adding element at beginning
 *  - Getting element by index
 *  - Peeking first element
 *  - Deleting an element
 *  - Printing the list
 */
public class Main {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create a new LinkedList object
        LinkedList nums = new LinkedList();

        // Add elements at the end of the list
        nums.add(15);
        nums.add(5);
        nums.add(4);

        // Add element at the beginning
        nums.addFirst(6);

        // Get element at index 2 (0-based index)
        System.out.println("Element at index 2: " + nums.get(2));

        // Peek first element
        System.out.println("First element (peek): " + nums.peek());

        // Print full list
        System.out.println("\nLinked List:");
        nums.printValues();

        // Delete element with value 5
        nums.delete(5);

        // Print list after deletion
        System.out.println("\nAfter deleting value 5:");
        nums.printValues();
    }
}