package World;

public class Solution {
    public ListNode deleteNode(ListNode head,int val){
        if(head==null)
            return head;
        ListNode cur=head;
        ListNode pre=null;
        if(cur.val==val)
            return head.next;
        while (cur.val!=val){
            pre=cur;
            cur=cur.next;
        }
        pre.next=pre.next.next;
        return head;
    }
}
