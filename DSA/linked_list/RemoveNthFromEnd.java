
class RemoveNthFromEnd {

    static Node remove(Node head, int n){

        Node dummy = new Node(0);
        dummy.next = head;

        Node first = dummy;
        Node second = dummy;

        for(int i=0;i<=n;i++){
            first = first.next;
        }

        while(first!=null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }
}
