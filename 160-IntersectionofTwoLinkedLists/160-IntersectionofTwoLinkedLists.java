// Last updated: 12/7/2025, 7:19:24 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode la=headA;
15        ListNode lb=headB;
16        while(la!=lb){
17            la=(la!=null)?la.next:headB;
18            lb=(lb!=null)?lb.next:headA;
19        }
20        return la;
21    }
22}