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

        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        ListNode curr = head;
        ListNode pev = null;
        while (curr!= null) {

            if (!m.containsKey(curr.val)) {
                m.put(curr.val,1);
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