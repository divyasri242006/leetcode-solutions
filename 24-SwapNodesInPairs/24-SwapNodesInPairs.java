// Last updated: 2/4/2026, 1:21:40 PM
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;

            // swap
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // move prev forward
            prev = first;
        }

        return dummy.next;
    }
}
