package List;
/**
 * ��Ŀ����
 * �������������ҳ����ǵĵ�һ��������㡣
 * 
 * Ѱ����������ĵ�һ�������ڵ㣬�����뵽���Ǳ�������������һ������ÿ���ڵ㣬�ٽ�����ڶ������Ƚϡ������������ĳ��ȷֱ�Ϊm��n��
 * ��ô��ʱ�临�Ӷ��ܴﵽO(mn)��
 * ͨ��˼�������ǿ���֪���������ڵ����������ϵĽڵ㶼����ͬ�ģ����Բ���ʱҲ���ԴӺ�����ǰ�ң������������Ƚ��������Ϳ����õ�ջ��
 * ��ô���������ѵĿռ临�Ӷ��ܴﵽO(n+m)��ʱ�临�ӶȴﵽO(n+m)
 * ��Ȼ���Ƕ���Ҫ����ͬ���ȵ�������������ô�ɲ����������롣����������ָ��ǰ��n����λ�ﵽ���̵�һ�£��ٴ�ͷ��ʼ�����Ƚϣ�����ʱ�临�Ӷ�Ҳ��
 * O(n+m)������ȴʡȥ�˶ѵĿռ�
 * 
 *@author Kaiscript
 *
 *2016��9��7������7:39:36
 */

public class FindFirstCommonNode {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int length1 = getListLength(pHead1);
		int length2 = getListLength(pHead2);
		ListNode longNode = pHead1;
		ListNode shortNode = pHead2;
		if(length2>length1){
			longNode = pHead2;
			shortNode = pHead1;
		}
		for(int i=0;i<Math.abs(length2-length1);i++)
			longNode = longNode.next;
		
		while(longNode!=null && shortNode!=null && longNode!=shortNode){
			longNode = longNode.next;
			shortNode = shortNode.next;
		}
		return longNode;
    }
	
	public int getListLength(ListNode head){
		int length = 0;
		while(head!=null){
			length++;
			head = head.next;
		}
		return length;
	}
	
}
