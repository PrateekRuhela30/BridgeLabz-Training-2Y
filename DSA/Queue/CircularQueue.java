import java.util.Scanner;
public class CircularQueue {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front = null;
    private Node rear = null;

    // Enqueue
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (front == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }

        System.out.println(value + " inserted");
    }

    // Dequeue
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        if (front == rear) {
            System.out.println(front.data + " deleted");
            front = rear = null;
        } else {
            System.out.println(front.data + " deleted");
            front = front.next;
            rear.next = front;
        }
    }

    // Display
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);

        System.out.println();
    }

    // Peek
    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front: " + front.data);
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Peek\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    cq.enqueue(sc.nextInt());
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    cq.peek();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}