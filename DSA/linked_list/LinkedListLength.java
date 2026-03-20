
class LinkedListLength {

    static int length(Node head){
        int count = 0;

        while(head!=null){
            count++;
            head = head.next;
        }

        return count;
    }
}
