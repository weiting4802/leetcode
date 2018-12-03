

Remove Nth Node From End of List

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
        if(n==0 || head==null) return head;
        int l = len(head);
        int k = l-n;
        int i = 1;
        
        if(n==1 && l == 1) return null;
        
        
        ListNode temp = head.next;
        ListNode pre = head;
        
        while(pre.next!=null){
             System.out.print(i + " " + temp.val + "\n");
            if(k==0){
                head = pre.next;
                pre.next = null;
                break;
            }
            else if(i == k && temp!=null){
                pre.next = temp.next;
                break;
            }
            
            temp = temp.next;
            pre = pre.next;
            i++;
        }
        
        return head;
    }
    
    public int len(ListNode n){
        int counter = 0;
        while(n!=null){
            counter++;
            n = n.next;
        }
        
        return counter;
    }
}


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode it = head;
        while(it != null){
            list.add(it);
            it = it.next;
        }
        
        int previt = list.size() - n - 1;
        int remit  = list.size() - n;
        ListNode rem = list.get(remit);
        if(previt < 0)
            return rem.next;
        ListNode prev = list.get(previt);
        prev.next = rem.next;
        return head;
    }
}```