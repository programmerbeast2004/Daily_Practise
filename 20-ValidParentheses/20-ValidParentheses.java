// Last updated: 10/2/2026, 5:04:40 AM
1class Solution {
2    public boolean isValid(String s) {
3	Stack<Character> stack = new Stack<Character>();
4	for (char c : s.toCharArray()) {
5		if (c == '(')
6			stack.push(')');
7		else if (c == '{')
8			stack.push('}');
9		else if (c == '[')
10			stack.push(']');
11		else if (stack.isEmpty() || stack.pop() != c)
12			return false;
13	}
14	return stack.isEmpty();
15    }
16}