package step_6_linked_list.single_linked_list_fundamentals;

public class deletion_of_the_head_of_linked_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode deleteHead(ListNode head) {
        if (head == null) {
            return null; // If the list is empty, return null
        }
        return head.next; // Move the head pointer to the next node
    }

    public static void main(String[] args) {
        deletion_of_the_head_of_linked_list obj = new deletion_of_the_head_of_linked_list();
        ListNode head = obj.new ListNode(10);
        head.next = obj.new ListNode(20);
        head.next.next = obj.new ListNode(30);

        // Print the original linked list
        System.out.print("Original linked list: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        // Delete the head of the linked list
        head = obj.deleteHead(head);

        // Print the linked list after deletion
        System.out.print("Linked list after deleting head: ");
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}