
class MergeTwoLists {

    static Node merge(Node l1, Node l2){

        Node dummy = new Node(0);
        Node temp = dummy;

        while(l1!=null && l2!=null){

            if(l1.data < l2.data){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if(l1!=null) temp.next = l1;
        if(l2!=null) temp.next = l2;

        return dummy.next;
    }
}
