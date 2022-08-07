package dsa;

public class QueueUsingArray {
    private int capacity;
    int queueArr[];
    int front;
    int rear;
    int currentSize = 0;
    public QueueUsingArray(int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = new int[this.capacity];
    }
    /**
     * this method is used to add element in the queue
     */
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!! Cannot add more elements");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data + " added to the queue");
        }
    }
    /**
     * This method removes an element from the front of
     the queue
     */
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!! Cannot dequeue element");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println(queueArr[front - 1]
                        + " removed from the queue");
                front = 0;
            } else {
                System.out.println(queueArr[front - 1]
                        + " removed from the queue");
            }
            currentSize--;
        }
    }
    /**
     * This method is use to check if element is full
     or not
     */
    public boolean isFull() {
        if (currentSize == capacity) {
            System.out.println("The queue is full.");
            return true;
        }else {
            System.out.println("The queue is not full.");
            return false;
        }
    }
    /**
     * This method is use to check if element is empty
     or not
     */
    public boolean isEmpty() {
        if (currentSize == 0) {
            System.out.println("The queue is empty.");
            return true;
        }else {
            System.out.println("The queue is not empty.");
            return false;
        }
    }
    /**
     * This method is use to fetch the first
     element of queue
     */
    public void peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty. Element Not Found");
        }else {
            System.out.println(queueArr[front]);
        }
    }
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.isEmpty();
        queue.enqueue(6);
        queue.dequeue();
        queue.peek();
        queue.enqueue(3);
        queue.enqueue(99);
        queue.enqueue(56);
        queue.peek();
        queue.dequeue();
        queue.enqueue(43);
        queue.dequeue();
        queue.enqueue(89);
        queue.enqueue(77);
        queue.dequeue();
        queue.enqueue(32);
        queue.enqueue(232);
        queue.isFull();
    }
}
