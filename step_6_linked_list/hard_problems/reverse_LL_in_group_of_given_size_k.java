package step_6_linked_list.hard_problems;

public class reverse_LL_in_group_of_given_size_k {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        ListNode curr = head;

        while(curr != null){

            // Count k nodes
            ListNode temp = curr;
            int count = 0;

            while(temp != null && count < k){
                temp = temp.next;
                count++;
            }

            // If less than k nodes remain
            if(count < k){
                tail.next = curr;
                break;
            }

            // Reverse k nodes
            ListNode prev = null;
            ListNode next = null;
            ListNode start = curr;

            count = 0;

            while(curr != null && count < k){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            // Add reversed group to blank list
            tail.next = prev;
            tail = start;
        }
        return dummy.next;
    }

    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
