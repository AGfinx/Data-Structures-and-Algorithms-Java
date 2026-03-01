package Trees;

public class Main {
    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();

        tree.insert(2);
        tree.insert(5);
        tree.insert(7);
        tree.insert(8);

        tree.insert(1);
        tree.inorder();
        System.out.println();
        tree.preorder();
    }
}