class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode t = dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null)t.next = t1;
        else t.next = t2;
        return dummy.next;
    }
}