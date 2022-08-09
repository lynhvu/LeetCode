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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode res = new ListNode(-1);
        ListNode tempTrack = res; // keep track of where the pointer is 

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tempTrack.next  = l1;
                l1 = l1.next;
            } else {
                tempTrack.next = l2;
                l2 = l2.next;
            }
            tempTrack = tempTrack.next;
        }
        // one of the list still have node? add it to the track list
        tempTrack.next = l1 == null? l2 : l1;
        return res.next;
    }
}