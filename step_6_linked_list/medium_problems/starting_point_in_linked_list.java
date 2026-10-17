package step_6_linked_list.medium_problems;

public class starting_point_in_linked_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode findStartingPoint(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        starting_point_in_linked_list obj = new starting_point_in_linked_list();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = head.next; // Creating a loop for testing

        ListNode startingPoint = obj.findStartingPoint(head);
        if (startingPoint != null) {
            System.out.println("Starting point of the loop in the linked list: " + startingPoint.val);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}
