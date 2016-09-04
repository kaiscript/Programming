package List;

/**
 * ��Ŀ����

���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * @author Kaiscript
 *
 * 2016��8��10������7:17:40
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
		p = head;  //pΪ�ϲ��������Ĺ���ָ��
		
		
		while(list1!=null && list2!=null){ //����һ��������βʱ��ѭ������
			if(list1.val<=list2.val){ //�������1�Ľ��С������2�Ľ��
				p.next = list1;	//ȡ���������ϲ�����
				list1 = list1.next; //����1����һλ
				p = p.next;  //����ָ�����һλ
			}
			else{  //����ȡ����2�Ľ��
				p.next = list2;
				list2 = list2.next;
				p = p.next;
			}
			
		}
		if(list1==null)//����1��������
			p.next = list2; //ָ��listNode2
		if(list2==null)
			p.next = list1;
		
		
		return head;
		//�ݹ�汾
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
