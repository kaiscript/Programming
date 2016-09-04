package List;

/**
 * 题目描述

输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author Kaiscript
 *
 * 2016年8月10日下午7:17:40
 */
public class MergeList {

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode Merge(ListNode list1, ListNode list2) {
		if(list1==null)
			return list2;
		if(list2==null)
			return list1;
		ListNode p;
		ListNode head;
		if(list1.val<=list2.val){
			head = list1;
			list1 = list1.next;
		}
		else{
			head = list2;
			list2 = list2.next;
		}
		p = head;  //p为合并后的链表的工作指针
		
		
		while(list1!=null && list2!=null){ //当有一个链表到结尾时，循环结束
			if(list1.val<=list2.val){ //如果链表1的结点小于链表2的结点
				p.next = list1;	//取这个结点加入合并链表
				list1 = list1.next; //链表1后移一位
				p = p.next;  //工作指针后移一位
			}
			else{  //否则取链表2的结点
				p.next = list2;
				list2 = list2.next;
				p = p.next;
			}
			
		}
		if(list1==null)//链表1遍历完了
			p.next = list2; //指向listNode2
		if(list2==null)
			p.next = list1;
		
		
		return head;
		//递归版本
		/*
		ListNode mergeHead = null;
		if(list1.val<list2.val){
			mergeHead = list1;
			mergeHead.next = Merge(mergeHead.next, list2);
		}
		else{
			mergeHead = list2;
			mergeHead.next = Merge(list1, mergeHead.next);
		}
		return mergeHead;*/
	}

	public static void main(String[] args) {

	}

}
