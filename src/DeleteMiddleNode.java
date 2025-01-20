public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode fast = head;
        ListNode slow = prev;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next= slow.next.next;
        return prev.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(4);
        node.next.next.next = new ListNode(7);
        node.next.next.next.next = new ListNode(1);
        node.next.next.next.next.next = new ListNode(2);
        node.next.next.next.next.next.next = new ListNode(6);
        ListNode result = new DeleteMiddleNode().deleteMiddle(node);
        while(result!=null){
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
}
