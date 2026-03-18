package Exercise02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello checking.");

        System.out.print("Enter the size of the circular queue : ");
        int size = scanner.nextInt();

        CircularQueue cq = new CircularQueue(size);

        //Initialize insertion to fill queue
        for (int i = 0; i < size; i++){
            System.out.print("Enter element to insert : ");
            cq.insert(scanner.nextInt());
        }

        //Queue is full now
        System.out.println("Queue is Full");

        //Remove one element
        System.out.println("Removing: "+cq.remove());

        //Insert new elements
        System.out.print("Enter new element to insert: ");
        cq.insert(scanner.nextInt());

        System.out.print("Enter another element to insert: ");
        cq.insert(scanner.nextInt());
    }
}
