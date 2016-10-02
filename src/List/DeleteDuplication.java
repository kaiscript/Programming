package List;

/**
 * ��Ŀ����
 * <p>
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣
 * ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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
        ListNode pre = null; //����preǰ�ڵ㣬�������ӱ�ɾ���ڵ��Ľڵ�
        ListNode node = pHead;
        while (node != null) {
            ListNode next = node.next;
            boolean needDelete = false;
            if (next != null && next.val == node.val)   //��ǰ�ڵ����¸��ڵ���ͬ�����Ϊ��Ҫɾ��
                needDelete = true;
            if (!needDelete) {   //����Ҫɾ��������ǰ��pre
                pre = node;
                node = node.next;
            } else { //��Ҫɾ��
                int delValue = node.val;  //��Ҫɾ���Ľڵ��ֵ
                ListNode delNode = node;
                while (delNode != null && delNode.val == delValue) {  //������ǰ�ڵ㼰֮��Ľڵ㣬ֵΪ��Ҫɾ����ֵ��next�α�ǰ��
                    next = delNode.next;
                    delNode.next = null;
                    delNode = next;
                }
                if (pre == null) //preΪ�գ���˵��ͷ�������Ҫ��ɾ����ֵ����pHead�α��Ƶ�next
                    pHead = next;
                else
                    pre.next = next; //pre��Ϊ�գ�����nextָ��next�ڵ�

                node = next;   //��������󡣽�node�α��Ƶ�next��
            }


        }

        return pHead;
    }
}
