package assignment2;

import stack.LinkedStack;
import stack.Stack;

public class PostfixEvaluation {
	/**
	 * This method evaluates a postfix expression
	 * 
	 * @param expression
	 *            is a postfix
	 * @return
	 */
	public static int evaluate(String expression) {
		Stack<Integer> stack = new LinkedStack<Integer>();
		for (int i = 0; i < expression.length(); i++) {
			char term = expression.charAt(i);
			if (Character.isWhitespace(term)) {
				continue;
			} else if (Character.isDigit(term)) {
				int number = 0;
				while (Character.isDigit(term)) {
					number = number * 10 + (term - '0');
					i++;
					term = expression.charAt(i);
				}
				i--;
				stack.push(number);
			} else {
				int value1 = stack.pop();
				int value2 = stack.pop();
				switch (term) {
				case '*':
					stack.push(value2 * value1);
					break;
				case '/':
					stack.push(value2 / value1);
					break;
				case '+':
					stack.push(value2 + value1);
					break;
				case '-':
					stack.push(value2 - value1);
					break;
				}
			}
		}
		return stack.pop();
	}
}
