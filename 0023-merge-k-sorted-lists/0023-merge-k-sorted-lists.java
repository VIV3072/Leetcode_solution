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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        PriorityQueue<Integer> p=new PriorityQueue<Integer>();
        int length=0;
        for(ListNode head: lists){
            while(head!=null){
                p.add(head.val);
                head=head.next;
                length+=1;
            }
        }
        for(int i=0;i<length;i++){
            ListNode n=new ListNode(p.poll());
            dummy.next=n;
            dummy=dummy.next;

        }
        return ans.next;
        
    }
}