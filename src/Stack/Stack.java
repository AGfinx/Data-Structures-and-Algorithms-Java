package Stack;

public class Stack {

    private int[] arr = new int[50];
    int top;
    int size;

    Stack(){
        top = -1;
        size = arr.length;
    }

    public void push(int i) {
        top++;
        arr[top] = i;
    }

    public void pop() {
    }
}
