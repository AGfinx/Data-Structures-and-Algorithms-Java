package Stack;

public class Main {
    public static void main(String[] args){

        Stack nums = new Stack();

        nums.push(10);
        nums.push(20);

        nums.printStack();
        System.out.println(nums.pop());

        nums.push(30);
        nums.push(40);

        nums.printStack();

        System.out.println(nums.peek());
    }
}
