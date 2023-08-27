package linked_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted_with_ArrayList {

	//both queue and deque needs to be instantiated with ArrayList, because the're both interfaces
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(27);
		numbers.add(6);
		numbers.add(99);
		numbers.add(28);
		numbers.add(17);
		
		System.out.println("Original list: " + numbers);
		
		Collections.sort(numbers);
		System.out.println("Ordered list: " + numbers);
	}

}
