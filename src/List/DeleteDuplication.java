package List;

/**
 * 题目描述
 * <p>
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * Created by Kaiscript on 2016/10/1.
 */
public class DeleteDuplication {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null)
            return null;
        ListNode pre = null; //设置pre前节点，负责连接被删除节点后的节点
        ListNode node = pHead;
        while (node != null) {
            ListNode next = node.next;
            boolean needDelete = false;
            if (next != null && next.val == node.val)   //当前节点与下个节点相同，标记为需要删除
                needDelete = true;
            if (!needDelete) {   //不需要删除，则标记前驱pre
                pre = node;
                node = node.next;
            } else { //需要删除
                int delValue = node.val;  //需要删除的节点的值
                ListNode delNode = node;
                while (delNode != null && delNode.val == delValue) {  //遍历当前节点及之后的节点，值为需要删除的值将next游标前移
                    next = delNode.next;
                    delNode.next = null;
                    delNode = next;
                }
                if (pre == null) //pre为空，则说明头结点是需要被删除的值。将pHead游标移到next
                    pHead = next;
                else
                    pre.next = next; //pre不为空，则将其next指向next节点

                node = next;   //做完操作后。将node游标移到next处
            }


        }

        return pHead;
    }
}
