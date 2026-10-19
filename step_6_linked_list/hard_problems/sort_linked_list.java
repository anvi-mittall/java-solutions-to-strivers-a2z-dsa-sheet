package step_6_linked_list.hard_problems;

public class sort_linked_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if(l1 != null){
            temp.next = l1;
        }

        if(l2 != null){
            temp.next = l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        sort_linked_list obj = new sort_linked_list();
        ListNode head = obj.new ListNode(4);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(1);
        head.next.next.next = obj.new ListNode(3);

        ListNode sortedHead = obj.sortList(head);
        System.out.print("Sorted linked list: ");
        while (sortedHead != null) {
            System.out.print(sortedHead.val + " ");
            sortedHead = sortedHead.next;
        }
    }
}
