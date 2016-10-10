package List;

import java.util.HashSet;
import java.util.Set;

/**
 * ��Ŀ����
 * һ�������а����������ҳ�������Ļ�����ڽ�㡣
 * <p>
 * Created by Kaiscript on 2016/10/2.
 */
public class EntryNodeOfLoop {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * ��һ��set��¼�Ƿ��������keyΪListNode.�������������ȡ������ֵ��Ϊ�գ������keyΪ��ڵĽڵ�
     *����ʱ�䣺40ms
     ռ���ڴ棺654k
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null)
            return null;
        Set<ListNode> set = new HashSet<>();
        while (pHead != null) {
            if (!set.add(pHead))
                return pHead;
            pHead = pHead.next;
        }
        return null;
    }

    /**
     * ��������ָ�롣�ȶ�ָ��ͷ������һ��ָ������ǰ�ƶ�K���ڵ��������ĳ��ȣ���Ȼ������ָ����ͬʱ�ƶ���
     * ���ǵ�������������ڴ���
     * ������ת��Ϊ�󻷵ĳ��ȡ�
     * ����һ��һ������ָ�룬һ��һ����1����һ��һ����2������ô���������ĵط��ض��ڻ��С�Ȼ���������˽ڵ㣬��ͳ�ƴ�����
     * ����ص��˽ڵ㣬��������ǻ��ĳ��ȡ�
     * <p></>����ʱ�䣺30ms
     ռ���ڴ棺629k
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop1(ListNode pHead) {
        ListNode meetingNode = MeetingListNode(pHead);
        if(meetingNode==null)
            return null;
        int loopLength = 1;
        ListNode node = meetingNode;
        while (node.next != meetingNode) { //�󻷵ĳ���
            node = node.next;
            loopLength++;
        }
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        for (int i = 0; i < loopLength; i++)
            p1 = p1.next;

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public ListNode MeetingListNode(ListNode pHead) {
        if (pHead == null)
            return null;
        ListNode pSlow = pHead.next;
        if (pSlow == null)
            return null;
        ListNode pFast = pSlow.next;
        while (pSlow != null && pFast != null) {
            if (pSlow == pFast)
                return pSlow;
            pSlow = pSlow.next;
            pFast = pFast.next;
            if (pFast != null)
                pFast = pFast.next;
        }
        return null;
    }

}
