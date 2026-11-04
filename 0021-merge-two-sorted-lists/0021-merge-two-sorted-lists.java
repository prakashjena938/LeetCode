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
        ListNode curr1 = list1;
        ListNode curr2 = list2;

        ListNode l = null;
        ListNode curr = l;

        while(curr1 != null && curr2 != null){
            
            int val = curr1.val;
            if(curr1.val<=curr2.val) curr1 = curr1.next;
            else{ 
                val = curr2.val;
                curr2 = curr2.next;
            }

            if(curr == null) {
                l=new ListNode(val);
                curr=l;
            }
            else{
                curr.next= new ListNode(val);
                curr=curr.next;
            }

        }
        while(curr1!=null){
           if(curr == null) {
                l=new ListNode(curr1.val);
                curr=l;
            }
            else{
                curr.next= new ListNode(curr1.val);
                curr=curr.next;
            }
            curr1=curr1.next;
        }
        while(curr2!=null){
            if(curr == null) {
                l=new ListNode(curr2.val);
                curr=l;
            }
            else{
                curr.next= new ListNode(curr2.val);
                curr=curr.next;
            }
            curr2=curr2.next;
        }

        return l;
    }
}