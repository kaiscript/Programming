package List;
/**
 * 题目描述<br>
输入一个链表，反转链表后，输出链表的所有元素。
 *@author Kaiscript
 *
 *2016年8月10日下午6:06:47
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
        ListNode reverserNode = ReverseListByRecur(head.next); //反转后面的链表，走到链表的末尾节点
        head.next.next = head;//反转指针
        head.next = null;
        return reverserNode;
    }

	//这样做在oj就会超时，我也搞不懂。上面不会
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
