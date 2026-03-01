package Trees;

/**
 * Node class represents a single node in the Binary Search Tree.
 * Each node contains:
 *  - data  : integer value stored in the node
 *  - left  : reference to left child
 *  - right : reference to right child
 */
class Node {
    int data;
    Node left;
    Node right;

    /**
     * Constructor to create a new node with given data.
     * Left and right children are initialized as null.
     */
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

/**
 * BinaryTree class implements a Binary Search Tree (BST).
 *
 * Properties of BST:
 *  - Left subtree contains values smaller than root
 *  - Right subtree contains values greater than root
 *  - No duplicate values allowed (based on current implementation)
 */
public class BinaryTree {

    // Root node of the tree
    Node root;

    /**
     * Public method to insert a value into the BST.
     * @param data value to be inserted
     */
    public void insert(int data) {
        root = insertRec(root, data);
    }

    /**
     * Recursive helper method to insert a new value in BST.
     *
     * @param root current node in recursion
     * @param data value to insert
     * @return updated node reference
     */
    private Node insertRec(Node root, int data) {

        // Base case: If tree/subtree is empty, create new node
        if (root == null) {
            root = new Node(data);
        }
        // If value is smaller, insert in left subtree
        else if (data < root.data) {
            root.left = insertRec(root.left, data);
        }
        // If value is greater, insert in right subtree
        else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        // Return the unchanged root node pointer
        return root;
    }

    /**
     * Performs Inorder Traversal (Left → Root → Right).
     * In BST, this prints elements in sorted order.
     */
    public void inorder() {
        inorderRec(root);
    }

    /**
     * Recursive helper for inorder traversal.
     *
     * @param root current node
     */
    public void inorderRec(Node root) {
        if (root != null) {

            // Visit left subtree
            inorderRec(root.left);

            // Visit root
            System.out.print(root.data + " ");

            // Visit right subtree
            inorderRec(root.right);
        }
    }

    /**
     * Performs Preorder Traversal (Root → Left → Right).
     * Useful for copying the tree structure.
     */
    public void preorder() {
        preorderRec(root);
    }

    /**
     * Recursive helper for preorder traversal.
     *
     * @param root current node
     */
    public void preorderRec(Node root) {
        if (root != null) {

            // Visit root
            System.out.print(root.data + " ");

            // Visit left subtree
            preorderRec(root.left);

            // Visit right subtree
            preorderRec(root.right);
        }
    }
}