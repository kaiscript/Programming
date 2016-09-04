package List;


/**
 * ��Ŀ����
����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
���ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 *@author Kaiscript
 *
 *2016��8��13������11:17:00
 */
public class Clone {
	
	public class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;

	    RandomListNode(int label) {
	        this.label = label;
	    }
	}
	
	public RandomListNode Clone(RandomListNode pHead){
		//���ƽڵ����������next�ڵ�
        RandomListNode p = pHead;
		while(p!=null){
			RandomListNode clone = new RandomListNode(p.label);
			clone.next = p.next;
			clone.random = null;
			p.next = clone;
			p = clone.next;
			
		}
        p = pHead;
        //Ϊ���ƽڵ��random�ڵ㸳����
		while(p!=null){
			RandomListNode clone = p.next;
			if(p.random!=null)
				clone.random = p.random.next;
			p = clone.next;
			
		}
		//���ԭ�����븴�Ƴ���������
        p = pHead;
        RandomListNode pcloneHead = null;
		RandomListNode pclone = null;
		
		if(p!=null){
			pcloneHead = pclone = p.next;
			p.next = pclone.next;
			p = pclone.next;
					
		}
		
		while(p!=null){
			pclone.next = p.next;
			pclone = p.next;
			p.next = pclone.next;
			p = pclone.next;
			
		}
		
		return pcloneHead;
    }
	
	
	
	public void copyNode(RandomListNode pHead){
		RandomListNode p = pHead;
		while(p!=null){
			RandomListNode clone = new RandomListNode(p.label);
			clone.next = p.next;
			p.next = clone;
			clone.random = null;
			p = clone.next;
			
		}
		
	}
	
	public void copyRandomLink(RandomListNode pHead){
		RandomListNode p = pHead;
		while(p!=null){
			RandomListNode clone = p.next;
			clone.random = p.random.next;
			p = clone.next;
			
		}
		
	}
		
	public RandomListNode breakList(RandomListNode pHead){
		RandomListNode p = pHead;
		RandomListNode pcloneHead = null;
		RandomListNode pclone = null;
		
		if(p!=null){
			pcloneHead = pclone = p.next;
			p.next = pclone.next;
			p = pclone.next;
					
		}
		
		while(p!=null){
			pclone.next = p.next;
			pclone = p.next;
			p.next = pclone.next;
			p = pclone.next;
			
		}
		
		
		return pcloneHead;
	}
	
	public static void main(String[] args) {

	}

}
