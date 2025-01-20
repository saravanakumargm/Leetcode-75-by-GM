public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode even = head.next;
        ListNode odd = head;
        ListNode temp = even;
        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = temp;
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode res = new OddEvenLinkedList().oddEvenList(node);
        while(res!=null){
            System.out.print(res.val);
            res = res.next;
        }
    }
}
