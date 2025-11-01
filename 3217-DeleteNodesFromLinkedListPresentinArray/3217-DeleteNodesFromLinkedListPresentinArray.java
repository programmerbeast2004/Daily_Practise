// Last updated: 11/1/2025, 3:05:44 PM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums) set.add(n);

        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;

        while(prev.next!=null){
            if(set.contains(prev.next.val)){
                prev.next=prev.next.next;
            }
            else{
                prev=prev.next;
            }
        }
        return dummy.next;
    }
}