package step_6_linked_list.single_linked_list_fundamentals;

public class insertion_at_the_head_of_linked_list {
    public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

    public ListNode insertAtHead(ListNode head, int X) {
        ListNode node = new ListNode(X);
        node.next = head;
        head = node;

        return head;
    }

    public static void main(String[] args) {
        insertion_at_the_head_of_linked_list obj = new insertion_at_the_head_of_linked_list();
        ListNode head = null;
        head = obj.insertAtHead(head, 10);
        head = obj.insertAtHead(head, 20);
        head = obj.insertAtHead(head, 30);

        // Print the linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
