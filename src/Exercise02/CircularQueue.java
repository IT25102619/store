package Exercise02;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int count;
    private int maxSize;

    // Constructor
    public CircularQueue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Insert element (circular behavior)
    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % maxSize;
        queue[rear] = item;
        count++;
    }

    // Remove element (circular behavior)
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removedItem = queue[front];
        front = (front + 1) % maxSize;
        count--;
        return removedItem;
    }

    // Peek front element
    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Check if empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if full
    public boolean isFull() {
        return count == maxSize;
    }
}

