public class MaxTwinSumOfList {
    public int pairSum(ListNode head) {
        ListNode currentHalf = head;
        ListNode revList = null;
        ListNode current = head;
        int sum = 0;
        while(currentHalf!=null && currentHalf.next!=null){
            currentHalf = currentHalf.next.next;
            ListNode temp = current.next;
            current.next = revList;
            revList  = current;
            current = temp;
        }
        while(current!=null){
            sum = Math.max(sum,current.val+revList.val);
            current = current.next;
            revList = revList.next;
        }
        return sum;
    }
}
