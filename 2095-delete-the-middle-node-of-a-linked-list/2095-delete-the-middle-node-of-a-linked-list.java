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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prev = head;
        ListNode current = head;
        int i = 0;
        while (current != null) {
            current = current.next;
            i++;
        }
        if(i<=1) return null;
        for (int i1 = 0; i1 < i / 2 - 1; i1++)
            prev = prev.next;
        prev.next = prev.next.next;
        return head;
    }
}