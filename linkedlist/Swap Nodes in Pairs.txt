

Swap Nodes in Pairs

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;        
        
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode result = new ListNode(0);
        result.next = cur;
        
        while(pre!=null && pre.next!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre.next = temp;
            if(temp == null || temp.next == null){    
                break;
            }
            
            pre.next = temp.next;
            pre = temp;
            cur = temp.next;
            
        }
        
        return result.next;
        
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = head.next;
        head.next = swapPairs(head.next.next);
        result.next = head;
        
        return result;
    }
}