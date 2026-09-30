package step_6_linked_list.single_linked_list_fundamentals;

public class insertion_at_the_tail_of_linked_list {
    public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
    public ListNode insertAtTail(ListNode head, int X) {
        ListNode node = new ListNode(X);

        if(head == null){
            return node;
        }

        ListNode tail = head;

        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = node;
        tail = node;

        return head;
    }

    public static void main(String[] args) {

        insertion_at_the_tail_of_linked_list obj = new insertion_at_the_tail_of_linked_list();

        // Linked List: 10 -> 20 -> 30
        ListNode head = obj.new ListNode(10);
        head.next = obj.new ListNode(20);
        head.next.next = obj.new ListNode(30);

        // Insert 40 at tail
        head = obj.insertAtTail(head, 40);

        // Print Linked List
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
