package ArrayList;

import java.util.*;

public class basics {

	public static void main(String[] args) {
		// first example of how to use an ArrayList

		// ArrayList of integers
		// Integer is a wrapper class for the primitive type int
		// Allows the primitive type to act like an object
		// its the referenced type form of int
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(1);// 0
		numbers.add(88);// 1
		numbers.add(27);// 2
		numbers.add(5);// 3
		numbers.add(33);// 4
		System.out.println("before: " + numbers.toString());

		numbers.remove(2);// remove item at index 2
		// 27 is removed from the array, so 33 get readjusted to idx 2
		numbers.remove(Integer.valueOf(44)); // remove integer 33, if it exists
		System.out.println(numbers.toString());

		numbers.set(3, Integer.valueOf(1));// replaces idx 3 with number 1
		System.out.println(numbers.toString());// print all the list
		System.out.println(numbers.get(2));// print one value

		numbers.sort(Comparator.naturalOrder());// sort the numbers
		System.out.println(numbers.toString());

		numbers.sort(Comparator.reverseOrder());// sort the numbers in a reverse order
		System.out.println(numbers.toString());

		System.out.println(numbers.size());// count the number of elements in the array

		System.out.println(numbers.contains(Integer.valueOf(1)));// checks if value is on the array

		// numbers.clear();//clear the array
		System.out.println(numbers.isEmpty());// checks if the list has values

		numbers.forEach(number -> {// for each number in the array list, you're going to do this action
			numbers.set(numbers.indexOf(number), number * 2);//update the element with multiplied value
		});
		System.out.println("after: " + numbers.toString());
	}

}
