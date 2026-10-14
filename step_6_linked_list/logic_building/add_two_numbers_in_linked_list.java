package step_6_linked_list.logic_building;

public class add_two_numbers_in_linked_list {
    public class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum/10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        add_two_numbers_in_linked_list obj = new add_two_numbers_in_linked_list();
        ListNode l1 = obj.new ListNode(2);
        l1.next = obj.new ListNode(4);
        l1.next.next = obj.new ListNode(3);

        ListNode l2 = obj.new ListNode(5);
        l2.next = obj.new ListNode(6);
        l2.next.next = obj.new ListNode(4);

        // Print the first linked list
        System.out.print("First linked list: ");
        ListNode current = l1;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        // Print the second linked list
        System.out.print("Second linked list: ");
        current = l2;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        // Add the two numbers
        ListNode result = obj.addTwoNumbers(l1, l2);

        // Print the result linked list
        System.out.print("Result linked list: ");
        current = result;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
