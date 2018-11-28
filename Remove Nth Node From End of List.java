
Remove Nth Node From End of List

https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/603/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length  = 1;
        ListNode tails = head;
        while(tails.next!=null){
            tails = tails.next;
            length++;
        }
        
        if(length == 1){
            head = null;
            return head;
        }
        
        ListNode temp = head;
        while(temp!= null){
            if(length == n){
                temp.val = temp.next.val;
                temp.next = temp.next.next;
                return head;
            }
            if(length == n +1){
              temp.next = temp.next.next;
                return head;
            }
            else{
                temp = temp.next;
                length--;
            }
        }
        
        return head;
        
    }
}


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (n-- > 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
