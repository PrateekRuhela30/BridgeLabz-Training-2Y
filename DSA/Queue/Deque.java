class Deque{

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert at front
    public void insertFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at rear
    public void insertRear(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove from front
    public void removeFront() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) { // only one node
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Remove from rear
    public void removeRear() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) { // only one node
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.insertFront(10);
        deque.insertFront(5);
        deque.insertRear(20);
        deque.insertRear(30);

        System.out.print("List: ");
        deque.display();

        deque.removeFront();
        System.out.print("After removing front: ");
        deque.display();

        deque.removeRear();
        System.out.print("After removing rear: ");
        deque.display();
    }
}

