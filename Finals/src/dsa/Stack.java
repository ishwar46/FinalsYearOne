package dsa;
//Stack Implementation DSA
public class Stack {
    int size;
    int arr[];
    int top;
    Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    // This function adds the element to the stack
    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element : " +
                    pushedElement);
        } else {
            System.out.println("Stack is full !");
        }
    }
    // This function removes the element from the stack
    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element : " +
                    arr[returnedTop]);
            return arr[returnedTop];
        } else {
            System.out.println("Stack is empty !");
            return -1;
        }
    }
    // This function displays the topmost element of the stack
    public int peek() {
        if(!this.isEmpty()) {
            System.out.println("The top most element of Page 9 stack is : " + arr[top]);
            return arr[top];
        }
        else
        {
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    // This function checks if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
    // This function checks whether the stack is full or not
    public boolean isFull() {
        return (size - 1 == top);
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.isEmpty();
    }
}
