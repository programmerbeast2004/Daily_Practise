// Last updated: 2/3/2026, 11:01:14 AM
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
12    public boolean isPalindrome(ListNode head) {
13        ListNode temp=head;
14        Stack<Integer> st=new Stack<>();
15        while(temp !=null){
16            st.push(temp.val);
17            temp=temp.next;
18        }
19        while(head!=null){
20            int c=st.pop();
21            if(head.val !=c){
22                return false;
23            }
24            head=head.next;
25        }
26        return true;
27
28
29    }
30}