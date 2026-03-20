
class SearchNode {

    static boolean search(Node head, int key){
        while(head!=null){
            if(head.data==key) return true;
            head = head.next;
        }
        return false;
    }
}
