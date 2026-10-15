package step_6_linked_list.medium_problems;

import java.util.ArrayList;
import java.util.List;

public class linked_list_is_palindrome_or_not {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while(left < right){
            if(! list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        linked_list_is_palindrome_or_not obj = new linked_list_is_palindrome_or_not();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(2);
        head.next.next.next = obj.new ListNode(1);

        // Print the linked list
        System.out.print("Linked list: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        boolean isPalindrome = obj.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
