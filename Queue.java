// Java Program to Implement
// Queue Data Structure

class QueueArr {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;
    
    // Constructor to initialize the queue
    public QueueArr(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    // Insert an element at the rear of the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }
    
    // Remove and return the element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removedItem = arr[front];
        front = (front + 1) % capacity;
        size--;
        return removedItem;
    }
    
    // Return the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    
    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }
}

public class Queue {
    public static void main(String[] args) {
        QueueArr queue = new QueueArr(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Front item: " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}