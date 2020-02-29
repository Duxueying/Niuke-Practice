public class ListNode {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<0){
            return null;
        }
        ListNode cur=head;
        int length=0;
        for(cur=head;cur!=null;cur=cur.next)//求长度
        {
            length++;
        }
        if (k > length)//判断长度和k的大小
        {
            return null;
        }
        cur=head;
        int len=length-(k-1);
        for(int i=1;i<len;i++)//遍历
        {
            cur=cur.next;
        }
        return cur;
    }
}