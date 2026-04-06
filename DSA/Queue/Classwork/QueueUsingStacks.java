import java.util.Stack;
public class QueueUsingStacks {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        // Push (enqueue)
        
        public void push(int x) {
            s1.push(x);
            System.out.println(x + " inserted");
        }

        // Pop (dequeue)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            // Transfer if needed
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }

        // Check empty
        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        // Display (for understanding)
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            // s2 (top to bottom)
            Stack<Integer> temp = new Stack<>();

            // Print s2 directly
            for (int i = s2.size() - 1; i >= 0; i--) {
                System.out.print(s2.get(i) + " ");
            }

            // Reverse s1 for correct order
            for (int i = 0; i < s1.size(); i++) {
                temp.push(s1.get(i));
            }

            while (!temp.isEmpty()) {
                System.out.print(temp.pop() + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);

        q.display();

        System.out.println("Removed: " + q.pop());
        System.out.println("Removed: " + q.pop());

        q.display();

        q.push(40);
        q.push(50);

        q.display();

        System.out.println("Front: " + q.peek());
    }
}