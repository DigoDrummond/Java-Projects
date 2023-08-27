package linked_list;

public class Stack {
	// stack -> LIFO, last in first out
	//gets in stack last, gets out first
	// push-> add to the top
	// pop -> remove from the top(array first element)
	//vertical tower
	private int[] array;
	private int n;

	Stack() {
		array = new int[10];
		n = 0;
	}

	Stack(int size) {
		array = new int[size];
		n = 0;
	}

	void Push(int value) {
		if (n >= array.length) {
			System.out.println("Error: Queue is full!");
			return;
		}
		for(int i=n;i>0;i--) {
			array[i] = array[i-1];
		}
		array[0] = value;
		n++;
	}
	void Pop() {
		if (n == 0) {
			System.out.println("Empty Stack!");
			return;
		}
		for(int i=0;i<n;i++) {
			array[i] = array[i+1];
		}
		n--;
	}
	void Show() {
		for(int i=0;i<n;i++) {
			System.out.printf(" %d, ", array[i]);
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.Push(3);
		stack.Push(4);
		stack.Push(5);
		stack.Push(6);
		stack.Show();
		stack.Pop();
		stack.Show();
	}

}
