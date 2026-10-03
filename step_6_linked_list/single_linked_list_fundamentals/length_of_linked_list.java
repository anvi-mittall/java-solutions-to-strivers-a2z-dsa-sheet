package step_6_linked_list.single_linked_list_fundamentals;

public class length_of_linked_list{
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public int getLength(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String args[]){
        length_of_linked_list list = new length_of_linked_list();
        ListNode head = list.new ListNode(1);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(3);
        head.next.next.next = list.new ListNode(4);

        int length = list.getLength(head);
        System.out.println("Length of the linked list: " + length);
    }
}