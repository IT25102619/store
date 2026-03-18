package Exercise01;

public class QueueArray {
    private int[] queue;
    private int front;
    private int rear;
    private int count;
    private int maxSize;

    //Constructor
    public QueueArray(int size){
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    //Insert item at rear
    public void insert(int item){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = item;
        count++;
    }

    //Remove item from front
    public int remove(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedItem = queue[front];
        front++;
        count--;
        return removedItem;
    }

    //Peek front item
    public int peekFront(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    //Check if queue is Empty
    public boolean isEmpty(){
        return count == 0;
    }

    //Check if queue is Full
    public boolean isFull(){
        return count == maxSize;
    }

    //Get number of elements
    public int getCount(){
        return count;
    }

    //Display queue elements
    public void displayQueue(){
        System.out.print("Queue Elements : ");
        for (int i = front; i <= rear; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
