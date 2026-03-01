package Trees;

/**
 * Main class to test Binary Search Tree implementation.
 *
 * This class demonstrates:
 *  - Insertion into BST
 *  - Inorder traversal (sorted output)
 *  - Preorder traversal
 */
public class Main {

    /**
     * Entry point of the program.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create a new Binary Search Tree
        BinaryTree tree = new BinaryTree();

        // Insert elements into the tree
        // Order matters because BST structure depends on insertion order
        tree.insert(2);
        tree.insert(5);
        tree.insert(7);
        tree.insert(8);
        tree.insert(1);

        // Inorder Traversal
        // Expected Output (Sorted Order): 1 2 5 7 8
        System.out.println("Inorder Traversal:");
        tree.inorder();

        System.out.println();

        // Preorder Traversal
        // Expected Output (Root-Left-Right order)
        System.out.println("Preorder Traversal:");
        tree.preorder();
    }
}