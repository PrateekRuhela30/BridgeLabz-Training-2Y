
class InsertAtEnd {

    static Node insert(Node head, int val){
        Node newNode = new Node(val);

        if(head==null) return newNode;

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Node head = null;
        head = insert(head,1);
        head = insert(head,2);
        head = insert(head,3);
        print(head);
    }
}
