  
  
  Remove Linked List Elements

  class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode fake = new ListNode(0);
        ListNode cur = head;
        fake.next = head;
        ListNode pre = fake;
        
        while(cur!=null){
            if(cur.val == val){
                pre.next = cur.next;           
            }else {
                pre = pre.next;
            }
               cur = cur.next;
        }
        return fake.next;
    }
}
  
  
  ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;