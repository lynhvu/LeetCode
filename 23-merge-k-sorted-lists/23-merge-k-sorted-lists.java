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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        Queue<ListNode> minHeap = new PriorityQueue<>((a, b)-> a.val - b.val);
        // add all lists to min heap
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.add(node);
            }   
        }
        // create a list node for result
        ListNode res = new ListNode(0);
        // working list node
        ListNode cur = res;
        // "loop" through min heap
        while (!minHeap.isEmpty()) {
            // get the top aka the small val node
            ListNode top = minHeap.poll();
            // set it to the working list
            cur.next = top;
            // advance the pointer of working list
            cur = cur.next;
            // advance pointer of current top and update min heap
            if (top.next != null) {
                minHeap.add(top.next);
            }     
        }
        return res.next;
    }
}