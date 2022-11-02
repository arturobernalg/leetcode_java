package easy.ValidParentheses;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String arg[]) {
        //ValidParentheses.isValid("()[]{}");
        // ValidParentheses.isValid("([)]");

        ValidParentheses.isValid("]");
    }

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(')');
            } else if (aChar == '{') {
                stack.push('}');
            } else if (aChar == '[') {
                stack.push(']');
            } else if (aChar == ')') {
                if (stack.isEmpty() || stack.pop() != aChar) {
                    return false;
                }
            } else if (aChar == ']') {
                if (stack.isEmpty() || stack.pop() != aChar) {
                    return false;
                }
            } else if (aChar == '}') {
                if (stack.isEmpty() || stack.pop() != aChar) {
                    return false;
                }
            }

        }

        return stack.empty();
    }
}
