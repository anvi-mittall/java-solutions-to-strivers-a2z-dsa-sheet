package step_6_linked_list.hard_problems;

public class rotate_a_linked_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode tail = head;
        int length = 1;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        k = k % length;

        if(k == 0){
            return head;
        }

        tail.next = head;

        int steps = length - k;
        ListNode newTail = head;

        for(int i=1; i<steps; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        rotate_a_linked_list solution = new rotate_a_linked_list();

        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int k = 2;

        ListNode rotatedHead = solution.rotateRight(head, k);

        while(rotatedHead != null){
            System.out.print(rotatedHead.val + " ");
            rotatedHead = rotatedHead.next;
        }
    }
}
