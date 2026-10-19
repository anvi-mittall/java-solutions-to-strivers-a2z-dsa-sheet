package step_6_linked_list.hard_problems;

public class merge_two_sorted_lists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null){
            temp.next = list1;
        }

        if(list2 != null){
            temp.next = list2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        merge_two_sorted_lists obj = new merge_two_sorted_lists();
        ListNode list1 = obj.new ListNode(1);
        list1.next = obj.new ListNode(2);
        list1.next.next = obj.new ListNode(4);

        ListNode list2 = obj.new ListNode(1);
        list2.next = obj.new ListNode(3);
        list2.next.next = obj.new ListNode(4);

        ListNode mergedList = obj.mergeTwoLists(list1, list2);
        System.out.print("Merged sorted linked list: ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
