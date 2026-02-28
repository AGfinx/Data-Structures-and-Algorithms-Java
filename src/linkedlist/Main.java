package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();

        nums.add(45);
        nums.add(45);
        nums.addFirst(45);

        System.out.println(nums.get(2));
        nums.peek();
    }
}
