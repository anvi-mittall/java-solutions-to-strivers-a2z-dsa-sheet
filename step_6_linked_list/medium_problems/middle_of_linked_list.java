package step_6_linked_list.medium_problems;

public class middle_of_linked_list {
    public class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode middleOfLinkedList(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        int mid = count/2;
        temp = head;

        for(int i=0; i<mid; i++){
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        middle_of_linked_list obj = new middle_of_linked_list();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        // Print the linked list
        System.out.print("Linked list: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        ListNode middleNode = obj.middleOfLinkedList(head);
        System.out.println("Middle node data: " + middleNode.data);
    }
}
