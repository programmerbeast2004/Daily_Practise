// Last updated: 11/19/2025, 7:09:32 PM
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
