// Last updated: 8/20/2025, 12:47:34 PM
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
        // Min-heap for nodes
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val; // sort by node values
            }
        });

        // Dummy node to build the merged list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Add the head of each list to the priority queue
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            }
        }

        // Extract the minimum node and add next node from that list
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            tail.next = node;   // attach to merged list
            tail = tail.next;   // move tail forward

            if (node.next != null) {
                pq.add(node.next);
            }
        }

        return dummy.next; // return the head of merged list
    }
}
