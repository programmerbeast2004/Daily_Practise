// Last updated: 2/3/2026, 10:41:31 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        ListNode dummy=new ListNode(-1,head);
14        ListNode prev=dummy;
15        while(prev.next !=null){
16            if(prev.next.val!=val){
17                prev=prev.next;
18            }
19            else{
20                prev.next=prev.next.next;
21            }
22        }
23        return dummy.next;
24    }
25}