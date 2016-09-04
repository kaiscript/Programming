package List;
/**
 * 
 * ��Ŀ����

����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ�� 
��������:
����Ϊ����ı�ͷ

�������:
���Ϊ��Ҫ��ӡ�ġ��������ı�ͷ
 *@author Kaiscript
 *
 *2016��7��30������5:52:28
 */
  
import java.util.ArrayList;
import java.util.Stack;
public class PrintList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
         Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        ListNode c = listNode;
        while(c!=null){
            stack.push(c.val);
            c = c.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
        
        
        /**
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode==null)
            return list;
        ListNode c = listNode;
        if(c!=null && c.next!=null){
            list = printListFromTailToHead(c.next);
        }
        list.add(c.val);
        return list;
        **/
        
        //out of memory
        /** ArrayList<Integer> list = new ArrayList<>();
        if(listNode==null){
            
            return list;
        }
            
        ListNode p = listNode;
        ListNode c = listNode.next;
        ListNode n = null;
        while(c!=null){
            n = c.next;  
            c.next = p;
          
            p = c;
            c = n;
        }
        while(p!=null){
            
            list.add(p.val);
            p = p.next;
        }
        return list;**/
        
        
    }
    
    
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
   }
    
}
