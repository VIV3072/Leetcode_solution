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
       PriorityQueue<Integer> q=new PriorityQueue<>();
        ListNode curr=new ListNode(10);
        ListNode dumy=curr;
        int len=0;
        for(ListNode head:lists){
            while(head!=null){
                q.add(head.val);
                head=head.next;
                len++;
                
            }
        }
        for(int i=0;i<len;i++){
            ListNode n=new ListNode(q.poll());
            dumy.next=n;
            dumy=dumy.next;
            
            
        }
        return curr.next;
        
    }
}