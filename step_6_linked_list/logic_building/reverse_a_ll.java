package step_6_linked_list.logic_building;

public class reverse_a_ll {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
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
        reverse_a_ll obj = new reverse_a_ll();
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

        // Reverse the linked list
        head = obj.reverseList(head);

        // Print the reversed linked list
        System.out.print("Reversed linked list: ");
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
