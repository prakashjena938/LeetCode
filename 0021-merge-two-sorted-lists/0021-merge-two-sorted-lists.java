/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        
        ListNode l = new ListNode();
        ListNode curr = null;

        while (list1 != null && list2 != null) {

            int val = list1.val;
            if (list1.val <= list2.val)
                list1 = list1.next;
            else {
                val = list2.val;
                list2 = list2.next;
            }

            if (curr== null) {
                curr=l;
                curr.val = val;
            } else {
                curr.next = new ListNode(val);
                curr = curr.next;
            }

        }

        curr.next = list1 != null ? list1 : list2;
        return l;
    }
}