package linked_list;

public class Sorted_list {
	private int[] array;
	int n;

	Sorted_list() {
		array = new int[10];
		n = 0;
	}

	Sorted_list(int size) {
		array = new int[size];
		n = 0;
	}

	void Insert(int value) {
		for (int i = n; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = value;
		n++;
	}

	void Swap(int menor, int i) {
		int temp = array[i];
		array[i] = array[menor];
		array[menor] = temp;
	}

	void SelectionSort() {
		for (int i = 0; i < (n - 1); i++) {
			int menor = i;
			for (int j = (i + 1); j < n; j++) {
				if (array[menor] > array[j])
					menor = j;
			}
			Swap(menor, i);
		}
	}
	void Show() {
		System.out.printf("[");
		for (int i = 0; i < n; i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.printf("]");
	}

	public static void main(String[] args) {
		Sorted_list list = new Sorted_list();
		
		list.Insert(27);
		list.Insert(3);
		list.Insert(54);
		list.Insert(33);
		list.Insert(48);
		list.Show();
		list.SelectionSort();
		list.Show();
	}

}
