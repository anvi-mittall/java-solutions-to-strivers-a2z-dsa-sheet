package step_6_linked_list.logic_building;

public class remove_nth_node_from_the_back_of_ll {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);

        if(n == 1){
            head = head.next;
        }else{
            ListNode temp =head;
            for(int i=1; i<n-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return reverse(head);
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        remove_nth_node_from_the_back_of_ll obj = new remove_nth_node_from_the_back_of_ll();
        ListNode head = obj.new ListNode(10);
        head.next = obj.new ListNode(20);
        head.next.next = obj.new ListNode(30);
        head.next.next.next = obj.new ListNode(40);
        head.next.next.next.next = obj.new ListNode(50);

        // Print the original linked list
        System.out.print("Original linked list: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        // Remove the 2nd node from the end of the linked list
        int n = 2;
        head = obj.removeNthFromEnd(head, n);

        // Print the linked list after removal
        System.out.print("Linked list after removing " + n + "th node from the end: ");
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
