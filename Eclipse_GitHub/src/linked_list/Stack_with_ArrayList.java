package linked_list;

import java.util.Stack;
import java.util.LinkedList;

public class Stack_with_ArrayList {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			System.out.println(stack.toString());
			stack.pop();
			System.out.println(stack.toString());
	}

}
