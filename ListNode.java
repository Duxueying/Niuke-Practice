public class ListNode {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<0){
            return null;
        }
        ListNode cur=head;
        int length=0;
        for(cur=head;cur!=null;cur=cur.next)//�󳤶�
        {
            length++;
        }
        if (k > length)//�жϳ��Ⱥ�k�Ĵ�С
        {
            return null;
        }
        cur=head;
        int len=length-(k-1);
        for(int i=1;i<len;i++)//����
        {
            cur=cur.next;
        }
        return cur;
    }
}