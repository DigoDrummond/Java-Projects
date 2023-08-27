package linked_list;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_with_ArrayList {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();//queue is an interface, so it can't be instantiated directly
		queue.add(0);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(queue.toString());
		queue.remove();
		System.out.println(queue.toString());

	}

}
