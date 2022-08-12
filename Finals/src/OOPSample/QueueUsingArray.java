package OOPSample;
//Create a JAVA class named QueueUsingArray and show the implementation of Queue using Array in it.
public class QueueUsingArray {
    int[] arr;
    int front;
    int rear;
    int size;
    public QueueUsingArray(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = data;
        }
    }
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int item = arr[front];
            front++;
            if (front > rear) {
                front = rear = -1;
            }
            return item;
        }
    }
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
