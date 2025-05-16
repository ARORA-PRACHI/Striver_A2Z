// https://leetcode.com/problems/merge-k-sorted-lists/description/

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode head:lists){
            if(head!=null){
                pq.add(head);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(!pq.isEmpty()){
            ListNode minNode=pq.poll();
            tail.next=minNode;
            tail=tail.next;
            if(minNode.next!=null){
                pq.add(minNode.next);
            }
        }
        return dummy.next;
    }
}
