package step_6_linked_list.medium_problems;

public class detect_a_loop_in_linked_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        detect_a_loop_in_linked_list obj = new detect_a_loop_in_linked_list();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = head.next; // Creating a loop for testing

        boolean hasCycle = obj.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
