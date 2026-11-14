package step_6_linked_list.hard_problems;

import java.util.HashMap;

public class clone_a_ll_with_random_and_next_pointer {
    public class ListNode {
        int val;
        ListNode next;
        ListNode random;

        ListNode(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public ListNode copyRandomList(ListNode head) {
        if(head == null){
            return null;
        }

        HashMap<ListNode, ListNode> map = new HashMap<>();

        ListNode temp = head;
        
        // create a copy of each node and store it in the map
        while(temp != null){
            map.put(temp, new ListNode(temp.val));
            temp = temp.next;
        }

        // assign next and random pointers for the copied nodes
        temp = head;
        while(temp != null){
            ListNode copy = map.get(temp);

            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);

            temp = temp.next;
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        clone_a_ll_with_random_and_next_pointer obj = new clone_a_ll_with_random_and_next_pointer();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next;

        ListNode clonedHead = obj.copyRandomList(head);

        // Print the cloned linked list
        ListNode temp = clonedHead;
        while (temp != null) {
            System.out.print("Node value: " + temp.val);
            if (temp.random != null) {
                System.out.print(", Random points to: " + temp.random.val);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            temp = temp.next;
        }
    }
}
