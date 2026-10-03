package step_6_linked_list.single_linked_list_fundamentals;

public class search_in_linked_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean searchKey(ListNode head, int key) {
        ListNode temp = head;
        
        while(temp != null){
            if(temp.val == key){
                return true;
            }else{
                temp = temp.next;
            }
        }
        return false;
    }

    public static void main(String args[]){
        search_in_linked_list list = new search_in_linked_list();
        ListNode head = list.new ListNode(1);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(3);
        head.next.next.next = list.new ListNode(4);

        int keyToSearch = 3;
        boolean isFound = list.searchKey(head, keyToSearch);
        System.out.println("Is " + keyToSearch + " found in the linked list? " + isFound);
    }
}
