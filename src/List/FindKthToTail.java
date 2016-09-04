package List;
/**
 * ��Ŀ����<br>
����һ����������������е�����k����㡣
 *@author Kaiscript
 *
 *2016��8��7������4:01:15
 */
public class FindKthToTail {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	/*����ָ�룬���õ�һ��ָ��͵ڶ���ָ�붼ָ��ͷ��㣬Ȼ�����õ�һ��ָ����(k-1)���������k���ڵ㡣
	 * Ȼ������ָ��ͬʱ�����ƶ�������һ����㵽��ĩβ��ʱ�򣬵ڶ����������λ�þ��ǵ�����k���ڵ���*/
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
