class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode temp = new ListNode(-1);
        temp.next = head;

        int len = Length(head);
        int N = len - n;

        ListNode curr = temp;

        int c = 0;
        while (c < N) {
            curr = curr.next;
            c++;
        }

        curr.next = curr.next.next;

        return temp.next;
    }
    public int Length(ListNode head) {
        ListNode temp = head;
        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }
}
