package linked_list;

public class Deque {

	private int[] array;
	private int n;

	Deque() {
		array = new int[10];
		n = 0;
	}

	Deque(int size) {
		array = new int[size];
		n = 0;
	}

	void InsertEnd(int value) {
		if (n >= array.length) {
			System.out.println("Error: List is full!");
			return;
		}
		array[n] = value;
		n++;
	}

	void InsertBeginning(int value) {
		if (n >= array.length) {
			System.out.println("Error: List is full!");
			return;
		}
		for (int i = n; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = value;
		n++;
	}
	void RemoveBeginning(){
		if (n == 0) {
			System.out.println("0 numbers on the array");
			System.exit(0);
		}
		for(int i=0;i<n;i++) {
			array[i] = array[i+1];
		}
		n--;
	}
	void RemoveEnding() {
		if (n == 0) {
			System.out.println("0 numbers on the array");
			System.exit(0);
		}
		n--;
	}
	void Show() {
		System.out.printf("\n[");
		for (int i = 0; i < n; i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.printf("]");
	}

	public static void main(String[] args) {
		Deque dq = new Deque();
		dq.InsertBeginning(1);
		dq.InsertBeginning(2);
		dq.InsertEnd(3);
		dq.InsertEnd(4);
		dq.Show();
		dq.RemoveBeginning();
		dq.RemoveEnding();
		dq.Show();
	}

}
