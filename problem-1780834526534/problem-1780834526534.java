// Last updated: 6/7/2026, 5:45:26 PM
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
12    public ListNode middleNode(ListNode head) {
13        int le=len(head);
14        int mid=le/2;
15        while(mid>0){
16            head=head.next;
17            mid--;
18        }
19        return head;
20    }
21    public int len(ListNode head){
22        int l=0;
23        while(head!=null){
24            l++;
25            head=head.next;
26        }
27        return l;
28    }
29}