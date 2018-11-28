
Delete Node in a Linked List *****

https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/553/

class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur = node;
        ListNode next = cur.next;
        cur.val = next.val;
        cur.next = next.next;
        
    }
}