// Last updated: 5/9/2026, 11:29:37 AM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int pop = 0;

        for (int x : pushed) { 
            stack.push(x);
            while (!stack.isEmpty() && stack.peek() == popped[pop]) {
                stack.pop();
                pop++;
            }
        }
        return pop == popped.length;
    }
}
