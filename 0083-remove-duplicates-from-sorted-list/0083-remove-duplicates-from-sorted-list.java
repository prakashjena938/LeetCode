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
    public ListNode deleteDuplicates(ListNode head) {

        HashSet<Integer> m = new HashSet<Integer>();

        ListNode curr = head;
        ListNode pev = null;
        while (curr!= null) {

            if (!m.contains(curr.val)) {
                m.add(curr.val);
                pev = curr;
                curr = curr.next;
            }
            else{
                pev.next = curr.next;
                curr.next=null;
                curr= pev.next;
            }
    
        }

        return head;

    }
}