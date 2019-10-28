import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode start = null;
        ListNode current = null;
        if(a == null && b == null) return start;
        int plus = 0;
        while(a!=null || b!= null){
            int tmp = plus;
            if(a!=null)
                tmp += a.val;
            if(b!=null)
                tmp+=b.val;
            if(start == null){
                current = new ListNode(tmp%10);
                start = current;
                plus = tmp/10;

            }else {
                current.next=new ListNode(tmp%10);
                current  = current.next;
                plus = tmp/10;
            }
            if(a==null&& b!=null)
                b=b.next;
            else if(a!=null && b== null)
                a=a.next;
            else {
                a=a.next;
                b=b.next;
            }

        }
        if(plus == 1)
            current.next = new ListNode(plus);

        return start;
    }
}
