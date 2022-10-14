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
    public ListNode deleteMiddle(ListNode head) {
        ListNode p = head;
        ListNode del = head;
        int count = 0;
        while(p!=null){
            count++;
            p=p.next;
        }
        if(count==1)return null;
        int mid = count / 2;
        int i = 0;
        while(i<mid-1){
            del = del.next;
            i++;
        }
        del.next=del.next.next;
        return head;
    }
}