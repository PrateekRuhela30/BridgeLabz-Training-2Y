
class DeleteNode {

    static Node delete(Node head, int key){

        if(head==null) return null;

        if(head.data==key) return head.next;

        Node temp = head;

        while(temp.next!=null && temp.next.data!=key){
            temp = temp.next;
        }

        if(temp.next!=null)
            temp.next = temp.next.next;

        return head;
    }
}
