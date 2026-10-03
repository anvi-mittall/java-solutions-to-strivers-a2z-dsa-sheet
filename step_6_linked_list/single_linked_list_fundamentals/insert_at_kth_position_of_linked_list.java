package step_6_linked_list.single_linked_list_fundamentals;

public class insert_at_kth_position_of_linked_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        ListNode newNode = new ListNode(X);

        if(K == 1){
            newNode.next = head;
            return newNode;
        }

        ListNode temp = head;
        for(int i=1; i<K-1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static void main(String args[]){
        insert_at_kth_position_of_linked_list list = new insert_at_kth_position_of_linked_list();
        ListNode head = list.new ListNode(1);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(3);

        head = list.insertAtKthPosition(head, 4, 2);

        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
