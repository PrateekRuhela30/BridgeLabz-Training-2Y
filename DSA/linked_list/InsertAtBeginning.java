
class InsertAtBeginning {

    static Node insert(Node head, int val){
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
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
        head = insert(head,3);
        head = insert(head,2);
        head = insert(head,1);
        print(head);
    }
}
