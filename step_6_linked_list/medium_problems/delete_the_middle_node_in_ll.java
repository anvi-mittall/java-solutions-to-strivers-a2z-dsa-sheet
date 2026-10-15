package step_6_linked_list.medium_problems;

public class delete_the_middle_node_in_ll {
    public class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        int mid = count/2;
        temp = head;

        for(int i=0; i<mid-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        delete_the_middle_node_in_ll obj = new delete_the_middle_node_in_ll();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        // Print the linked list
        System.out.print("Linked list before deletion: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        head = obj.deleteMiddle(head);

        // Print the linked list after deletion
        System.out.print("Linked list after deletion: ");
        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
