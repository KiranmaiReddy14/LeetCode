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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode oddNode = new ListNode(0);
        ListNode evenNode = new ListNode(0);
        ListNode odd = oddNode;
        ListNode even = evenNode;
        int count = 1;

        while (head != null) {
            if (count % 2 == 0) { // even nodes
                even.next = head;
                even = even.next;
            } else {// odd nodes
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
            count++;
        }
        even.next = null;
        odd.next = evenNode.next;
        return oddNode.next;
    }
}