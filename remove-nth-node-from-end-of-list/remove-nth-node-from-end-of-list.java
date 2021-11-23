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
    public ListNode removeNthFromEnd(ListNode head, int n) {       
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }     
        if (size == n){
            return head.next;
        }
        cur = head;
        int index = 0;
        while (index < size) {
            if (index == (size - n - 1)) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
            index++;
        }
        return head;
    }
}