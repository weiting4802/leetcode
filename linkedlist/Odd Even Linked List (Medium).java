
Odd Even Linked List (Medium)

public ListNode oddEvenList(ListNode head) {
    if(head==null||head.next==null) return head;
    ListNode odd=head,ehead=head.next,even=ehead;
    while(even!=null&&even.next!=null){
        odd.next=even.next;
        odd=odd.next;
        even.next=odd.next;
        even=even.next;
    }
    odd.next=ehead;
    return head;
}