public class LinkedListInQueueUsingPushPop {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class
    static class QueueLL {
        private Node front, back;

        // Enqueue
        public void enqueue(int value) {
            Node newNode = new Node(value);

            if (back == null) {
                front = back = newNode;
            } else {
                back.next = newNode;
                back = newNode;
            }

            System.out.println(value + " enqueued");
        }

        // Push (same as enqueue)
        public void push(int value) {
            Node newNode = new Node(value);

            if (back == null) {
                front = back = newNode;
            } else {
                back.next = newNode;
                back = newNode;
            }

            System.out.println(value + " pushed");
        }

        // Dequeue
        public int dequeue() {
            if (front == null) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int removed = front.data;
            front = front.next;

            if (front == null) {
                back = null;
            }

            return removed;
        }

        // Pop (same as dequeue)
        public int pop() {
            if (front == null) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int removed = front.data;
            front = front.next;

            if (front == null) {
                back = null;
            }

            return removed;
        }

        // Peek
        public int peek() {
            if (front == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return front.data;
        }

        // Display
        public void display() {
            if (front == null) {
                System.out.println("Queue is Empty");
                return;
            }

            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        QueueLL q = new QueueLL();

        q.push(10);
        q.push(20);
        q.push(30);

        q.display();

        System.out.println("Pop: " + q.pop());   // removes 10
        System.out.println("Pop: " + q.pop());   // removes 20

        q.display();

        q.enqueue(40);

        q.display();

        System.out.println("Front: " + q.peek());
    }
}