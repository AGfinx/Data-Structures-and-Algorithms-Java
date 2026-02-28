package Stack;

public class Stack {

    private int[] arr = new int[50];
    int top;
    int size;

    Stack(){
        top = -1;
        size = arr.length;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top >= size - 1);
    }

    public void push(int i) {
        top++;
        arr[top] = i;
    }

    public void pop() {
    }

    public void printStack(){
        for (int i = 0; i<=top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
