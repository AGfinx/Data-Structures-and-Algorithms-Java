package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();

        nums.add(15);
        nums.add(5);
        nums.add(4);

        nums.addFirst(6);

        System.out.println(nums.get(2));
        nums.peek();

        nums.printValues();
        nums.delete(5);
        nums.printValues();

    }
}
