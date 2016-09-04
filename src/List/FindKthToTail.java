package List;
/**
 * 题目描述<br>
输入一个链表，输出该链表中倒数第k个结点。
 *@author Kaiscript
 *
 *2016年8月7日下午4:01:15
 */
public class FindKthToTail {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	/*两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，到达第k个节点。
	 * 然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了*/
	public static ListNode FindKthToTail(ListNode head,int k){
		if(head==null || k<=0)
			return null;
		ListNode pre = head;
		ListNode p = head;
		for(int i=1;i<k;i++){
			if(pre.next!=null)
				pre = pre.next;
			else
				return null;
		}
		
		while(pre.next!=null){
			pre = pre.next;
			p = p.next;
		}
		return p;
	}
	
	//out of 1s time
	/*public static ListNode FindKthToTail0(ListNode head,int k){
		ListNode p = head;
		ListNode c = head.next;
		ListNode n = null;
		while(c!=null && c.next!=null){
			n = c.next;
			c.next = p;
			p = c;
			c = n;
		}
		c.next = p;
		while(c.next!=null && k>1){
			c = c.next;
			k--;
		}
		return c;
	}*/
	
	public static void main(String[] args) {
		
	}
	
}
