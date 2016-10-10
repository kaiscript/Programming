package List;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目描述
 * 一个链表中包含环，请找出该链表的环的入口结点。
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
     * 用一个set记录是否遍历过，key为ListNode.如果遍历过，则取出来的值不为空，则这个key为入口的节点
     *运行时间：40ms
     占用内存：654k
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
     * 利用两个指针。先都指向头部。第一个指针先向前移动K个节点数（环的长度）。然后两个指针再同时移动，
     * 他们的相遇处即是入口处。
     * 那问题转化为求环的长度。
     * 设置一快一慢两个指针，一个一次走1步，一个一次走2步，那么他们相遇的地方必定在环中。然后再游历此节点，并统计次数，
     * 如果回到此节点，则次数就是环的长度。
     * <p></>运行时间：30ms
     占用内存：629k
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop1(ListNode pHead) {
        ListNode meetingNode = MeetingListNode(pHead);
        if(meetingNode==null)
            return null;
        int loopLength = 1;
        ListNode node = meetingNode;
        while (node.next != meetingNode) { //求环的长度
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
