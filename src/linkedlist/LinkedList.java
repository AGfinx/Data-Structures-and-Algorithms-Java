package linkedlist;

/**
 * Node class represents a single element in the linked list.
 * Each node contains:
 *  - data : the value stored in the node
 *  - next : reference to the next node in the list
 */
class Node {

    int data;       // Data stored in the node
    Node next;      // Reference to the next node

    /**
     * Constructor to initialize node with given data.
     *
     * @param data value to be stored in the node
     */
    Node(int data) {
        this.data = data;
        this.next = null; // Initially next is null
    }
}

/**
 * LinkedList implementation using a singly linked list.
 *
 * Supports basic operations:
 *  - Add at end
 *  - Add at beginning
 *  - Get element by index
 *  - Delete by value
 *  - Peek first element
 *  - Print list
 */
public class LinkedList {

    private Node head = null;  // Head of the linked list

    /**
     * Adds a new node at the end of the list.
     *
     * @param data value to be added
     */
    public void add(int data) {

        Node newNode = new Node(data);

        // If list is empty, new node becomes head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Attach new node at the end
        current.next = newNode;
    }

    /**
     * Adds a new node at the beginning of the list.
     *
     * @param data value to be added
     */
    public void addFirst(int data) {

        Node newNode = new Node(data);

        // Point new node to current head
        newNode.next = head;

        // Update head to new node
        head = newNode;
    }

    /**
     * Returns element at given index.
     *
     * @param index position of element (0-based)
     * @return data at specified index
     * @throws IndexOutOfBoundsException if index is invalid
     */
    public int get(int index) {

        int count = 0;
        Node current = head;

        // Traverse list until index is reached
        while (current != null) {

            if (count == index) {
                return current.data;
            }

            current = current.next;
            count++;
        }

        // If index is greater than list size
        throw new IndexOutOfBoundsException("Index: " + index);
    }

    /**
     * Returns the first element of the list without removing it.
     *
     * @return data at head node
     * @throws IllegalStateException if list is empty
     */
    public int peek() {

        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        return head.data;
    }

    /**
     * Deletes the first occurrence of the given value from the list.
     *
     * @param value element to be removed
     */
    public void delete(int value) {

        // If list is empty, do nothing
        if (head == null) return;

        // If head contains the value
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;

        // Traverse to find node before the target value
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        // If value found, remove it
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    /**
     * Prints all elements of the linked list.
     * Format: data1 -> data2 -> ... -> null
     */
    public void printValues() {

        Node current = head;

        // Traverse and print each node
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}