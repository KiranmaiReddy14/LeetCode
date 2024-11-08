/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dum = new ListNode(0, head);
        ListNode prev = dum;
        ListNode curr = head;
        if (head == null || head.next == null)
            return head;
        while (curr != null && curr.next != null) {
            ListNode third = curr.next.next;
            ListNode next = curr.next;

            next.next = curr;
            curr.next = third;
            prev.next = next;

            prev = curr;
            curr = third;
        }
        return dum.next;
    }
}