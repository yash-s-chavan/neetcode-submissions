/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        if(head.next == null && n == 1){
            return head.next;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode front = dummy;
        ListNode back = dummy;
        for(int i = 0;i<n;i++){
            if(back == null){
                return head;
            }
            back = back.next;
        }
        while(back.next!=null){
            front = front.next;
            back = back.next;
        }
        System.out.println(front.val);
        System.out.println(back.val);
        front.next = front.next.next;
        return dummy.next;
    }
}
