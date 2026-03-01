package Trees;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }

}

public class BinaryTree {

    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data){
        if (root == null){
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        }
        else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inorder(){
        inorderRec(root);

    }
    public void inorderRec(Node root){
        if (root != null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preorder(){
        preorderRec(root);

    }
    public void preorderRec(Node root){
        if (root != null){
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
}
