package step_6_linked_list.medium_problems;

public class intersection_point_of_Y_ll {

    //public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //    ListNode tempA = headA;

    //    while(tempA != null){
    //        ListNode tempB = headB;

    //        while(tempB != null){
    //            if(tempA == tempB){
    //                return tempA;
    //             }
    //             tempB = tempB.next;
    //         }
    //         tempA = tempA.next;
    //     }
    //     return null;
    // }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int countA = 0;
        int countB = 0;

        while(tempA != null){
            countA++;
            tempA = tempA.next;
        }

        while(tempB != null){
            countB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        while(countA > countB){
            tempA = tempA.next;
            countA--;
        }

        while(countB > countA){
            tempB = tempB.next;
            countB--;
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    public static void main(String[] args) {
        intersection_point_of_Y_ll obj = new intersection_point_of_Y_ll();

        ListNode headA = obj.new ListNode(4);
        headA.next = obj.new ListNode(1);
        ListNode intersection = obj.new ListNode(8);
        headA.next.next = intersection;
        intersection.next = obj.new ListNode(4);
        intersection.next.next = obj.new ListNode(5);

        ListNode headB = obj.new ListNode(5);
        headB.next = obj.new ListNode(0);
        headB.next.next = obj.new ListNode(1);
        headB.next.next.next = intersection;

        ListNode result = obj.getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection point value: " + result.val);
        } else {
            System.out.println("No intersection point found.");
        }
    }
}
