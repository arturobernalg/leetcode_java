package medium.AddTwoNumbers;

import node.ListNode;

public class AddTwoNumbers {

    public static void main(String arg[]) {

        ListNode node = new ListNode(2);
        node.next = new ListNode(4);
        node.next.next = new ListNode(6);


        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);

        AddTwoNumbers.addTwoNumbers(node, node2);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int rest = 0;
        int sum;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1!=null || l2!=null || rest>0){
            sum=0;
            if(l1!=null){
                sum= sum + l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=rest;
            rest = sum/10;
            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;
        }
        curr.next=null;
        return dummy.next;
    }


    private static ListNode create() {
        ListNode node = new ListNode(2);
        node.next = new ListNode(4);
        node.next.next = new ListNode(6);


        return node;
    }


}
