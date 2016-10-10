package List;
/**
 * ��Ŀ����<br>
����һ��������ת�����������������Ԫ�ء�
 *@author Kaiscript
 *
 *2016��8��10������6:06:47
 */
public class ReverseList {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode ReverseList(ListNode head) {
		if(head==null)
			return null;
		ListNode p = null;
		ListNode c = head;
		ListNode n = null;
		while(c!=null){
			n = c.next;
			c.next = p;
			p = c;
			c = n;
		}
		return p;
	}

	public ListNode ReverseListByRecur(ListNode head){
	    if(head==null || head.next==null)  //
            return head;
        ListNode reverserNode = ReverseListByRecur(head.next); //��ת����������ߵ������ĩβ�ڵ�
        head.next.next = head;//��תָ��
        head.next = null;
        return reverserNode;
    }

	//��������oj�ͻᳬʱ����Ҳ�㲻�������治��
	public ListNode ReverseList0(ListNode head) {
		if(head==null)
			return null;
		ListNode p = head;
		ListNode c = p.next;
		ListNode n = null;
		while(c!=null){
			n = c.next;
			c.next = p;
			p = c;
			c = n;
		}
		return p;
    }
	
	public static void main(String[] args) {
		
	}

}
