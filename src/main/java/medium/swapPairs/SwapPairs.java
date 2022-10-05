package medium.swapPairs;

import node.ListNode;

public class SwapPairs {

    public static void main(String arc[]) {


        SwapPairs.swapPairs(create());
    }

    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        ListNode newNext = newHead.next; // next 3 next 4
        newHead.next = head;
        head.next = swapPairs(newNext);

        return newHead;

    }

    private static ListNode create() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        return node;
    }
}
