package step_6_linked_list.hard_problems;

public class flattening_of_ll {
    public class ListNode {
        int val;
        ListNode next;
        ListNode child;

        ListNode(int val) {
            this.val = val;
            this.next = null;
            this.child = null;
        }
    }

    public ListNode flattenLinkedList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = flattenLinkedList(head.next);

        head = merge(head, newHead);

        return head;
    }

    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(a != null && b != null){
            if(a.val < b.val){
                temp.child = a;
                a = a.child;
            }else{
                temp.child = b;
                b = b.child;
            }

            temp = temp.child;
            temp.next = null;
        }

        if(a != null){
            temp.child = a;
        }else{
            temp.child = b;
        }
        return dummy.child;
    }

    public static void main(String[] args) {
        flattening_of_ll obj = new flattening_of_ll();
        ListNode head = obj.new ListNode(5);
        head.child = obj.new ListNode(7);
        head.child.child = obj.new ListNode(8);
        head.child.child.child = obj.new ListNode(30);

        head.next = obj.new ListNode(10);
        head.next.child = obj.new ListNode(20);

        head.next.next = obj.new ListNode(19);
        head.next.next.child = obj.new ListNode(22);
        head.next.next.child.child = obj.new ListNode(50);

        head.next.next.next = obj.new ListNode(28);
        head.next.next.next.child = obj.new ListNode(35);
        head.next.next.next.child.child = obj.new ListNode(40);
        head.next.next.next.child.child.child = obj.new ListNode(45);

        ListNode flattenedHead = obj.flattenLinkedList(head);

        // Print the flattened linked list
        while (flattenedHead != null) {
            System.out.print(flattenedHead.val + " ");
            flattenedHead = flattenedHead.child;
        }
    }
}
