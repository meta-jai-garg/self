package assignment2;

import stack.LinkedStack;
import stack.Stack;

public class Conversion {
	private static int getPrecedence(String operator) {
		switch (operator) {
		case "||":
			return 1;
		case "&&":
			return 2;
		case "!=":
		case "==":
			return 3;
		case ">":
		case ">=":
		case "<":
		case "<=":
			return 4;
		case "+":
		case "-":
			return 5;
		case "*":
		case "/":
			return 6;
		case "!":
		case "^":
			return 7;
		}
		return -1;
	}

	public static String infixToPostfix(String expression) {
		String result = "";

		String[] exp = expression.split(" ");
		Stack<String> stack = new LinkedStack<String>();
		for (int i = 0; i < exp.length; i++) {
			if (isVariable(exp[i])) {
				result += exp[i] + " ";
			} else if ("(".equals(exp[i])) {
				stack.push(exp[i]);
				System.out.println(stack.peek());
			} else if (")".equals(exp[i])) {
				while (!stack.isEmpty() && !("(".equals(stack.peek()))) {
					result += stack.pop() + " ";
				}
				if (stack.isEmpty() || !("(".equals(stack.peek()))) {
					throw new AssertionError("invalid expression");
				} else {
					stack.pop();
				}
			} else {
				while (!stack.isEmpty()
						&& getPrecedence(exp[i]) <= getPrecedence(stack.peek())) {
					result += stack.pop() + " ";
				}
				stack.push(exp[i]);
				System.out.println(stack.peek());
			}
		}
		while (!stack.isEmpty()) {
			result += stack.pop() + " ";
		}
		return result.trim();
	}

	private static boolean isVariable(String string) {
		for (int i = 0; i < string.length(); i++) {
			int c = string.charAt(i);
			if (!(c >= 65 && c <= 90 || c >= 97 && c <= 122 || c >= 48
					&& c <= 57)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out
				.println(infixToPostfix("ab + b * ( c ^ d - e ) ^ ( f + g ^ h ) - i"));
	}
}