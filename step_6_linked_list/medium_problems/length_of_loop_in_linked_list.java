package step_6_linked_list.medium_problems;

public class length_of_loop_in_linked_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public int findLengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;

            if(slow == fast){
                return count;
            }
        }
        return 0;
     }

     public static void main(String[] args) {
         length_of_loop_in_linked_list obj = new length_of_loop_in_linked_list();
         ListNode head = obj.new ListNode(1);
         head.next = obj.new ListNode(2);
         head.next.next = obj.new ListNode(3);
         head.next.next.next = obj.new ListNode(4);
         head.next.next.next.next = head.next; // Creating a loop for testing

         int lengthOfLoop = obj.findLengthOfLoop(head);
         System.out.println("Length of the loop in the linked list: " + lengthOfLoop);
     }
 }
