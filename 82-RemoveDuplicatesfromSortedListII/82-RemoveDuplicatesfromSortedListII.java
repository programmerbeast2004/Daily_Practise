// Last updated: 5/17/2026, 9:40:37 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy=new ListNode(0,head);
14        ListNode prev=dummy;
15        ListNode curr=head;
16        while(curr!=null){
17            while(curr.next!=null && curr.val==curr.next.val){
18                curr=curr.next;
19            }
20            if(prev.next!=curr){
21                prev.next=curr.next;
22            }
23            else{
24                prev=prev.next;
25            }
26            curr=curr.next;
27        }
28        return dummy.next;
29    }
30}