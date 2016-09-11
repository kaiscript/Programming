package List;
/**
 * 题目描述
 * 输入两个链表，找出它们的第一个公共结点。
 * 
 * 寻找两个链表的第一个公共节点，首先想到的是暴力法，遍历第一条链的每个节点，再将其与第二条链比较。假设两条链的长度分别为m和n。
 * 那么，时间复杂度能达到O(mn)。
 * 通过思考，我们可以知道，公共节点后的两条链上的节点都是相同的，所以查找时也可以从后面往前找，听起来就是先进后出，这就可以用到栈，
 * 那么构造两个堆的空间复杂度能达到O(n+m)，时间复杂度达到O(n+m)
 * 既然我们都是要求相同长度的两条子链，那么可不可以这样想。将长的链的指针前移n个单位达到跟短的一致，再从头开始遍历比较，这样时间复杂度也是
 * O(n+m)，但是却省去了堆的空间
 * 
 *@author Kaiscript
 *
 *2016年9月7日下午7:39:36
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
