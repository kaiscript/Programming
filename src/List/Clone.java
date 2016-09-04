package List;


/**
 * 题目描述
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *@author Kaiscript
 *
 *2016年8月13日下午11:17:00
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
		//复制节点成链条，有next节点
        RandomListNode p = pHead;
		while(p!=null){
			RandomListNode clone = new RandomListNode(p.label);
			clone.next = p.next;
			clone.random = null;
			p.next = clone;
			p = clone.next;
			
		}
        p = pHead;
        //为复制节点的random节点赋引用
		while(p!=null){
			RandomListNode clone = p.next;
			if(p.random!=null)
				clone.random = p.random.next;
			p = clone.next;
			
		}
		//拆分原链条与复制出来的链条
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
