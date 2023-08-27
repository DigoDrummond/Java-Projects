package linked_list;

class List {
	private int[] array;
	private int n;

	List() {
		array = new int[10];
		n = 0;// count
	}

	List(int tamanho) {
		array = new int[tamanho];
		n = 0;
	}

	void InsertBeginning(int x) {

		if (n >= array.length) {
			System.out.println("Error: List is full!");
			return;
		}

		for (int i = n; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = x;
		n++;

	}

	void InsertEnd(int x) {// no fim da lista(posição n),

		if (n >= array.length) {
			System.out.println("Error: List is full!");
			return;
		}
		array[n] = x;
		n++;

	}

	void InsertAtIndex(int x, int idx) {

		if (idx < 0 || n >= array.length || idx > n) {
			System.out.println("Error: Invalid index");
			return;
		}
		// pega elementos depois de idx e joga para frente, abre espaço
		for (int i = n; i > idx; i--) {
			array[i] = array[i - 1];
		}
		array[idx] = x;
		n++;

	}

	int RemoveBeginning() {
		if (n == 0) {
			System.out.println("0 numbers on the array");
			System.exit(0);
		}
		int res = array[0];
		n--;// reduz uma posição do array
		for (int i = 0; i < n; i++) {
			array[i] = array[i + 1];// sobrescreve valores do array
		}
		return res;
	}

	int RemoveEnd() {
		if (n == 0) {
			System.out.println("0 numbers on the array");
			System.exit(0);
		}
		return array[--n];
	}

	int RemoveAtIndex(int idx) {
		if (n == 0 || idx < 0 || idx > n) {
			System.out.println("Error to remove!");
			System.exit(0);
			;
		}
		int res = array[idx];
		n--;
		for (int i = idx; i < n; i++) {
			array[i] = array[i + 1];
		}
		return res;
	}

	void Show() {
		System.out.printf("[");
		for (int i = 0; i < n; i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.printf("]");
	}

	int Sum() {
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += array[i];
		return sum;
	}

	int Highest() {
		int h = array[0];
		for (int i = 0; i < n; i++) {
			if (array[i] > h)
				h = array[i];
		}
		return h;
	}

	int[] evenAnd5multiples() {
		int even = 0;
		int multiples = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0)
				even++;
			if (array[i] % 5 == 0)
				multiples++;
		}
		return new int[] { even, multiples };
	}

	void invertedArray() {
		int startIndex = 0;
		int endIndex = n - 1;
		while (startIndex < endIndex) {
			// Troca os elementos nas posições startIndex e endIndex
			int temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] = temp;

			// Avança o início e retrocede o final
			startIndex++;
			endIndex--;
		}
	}

	boolean Search(int x) {
		for (int i = 0; i < n; i++) {
			if (array[i] == x)
				return true;
		}
		return false;
	}
}

public class ex1 {

	public static void main(String[] args) {
		List lista = new List();
		int x1, x2;

		lista.InsertBeginning(1);
		lista.InsertBeginning(5);
		lista.InsertEnd(4);
		lista.InsertAtIndex(7, 3);
		lista.Show();

		x1 = lista.RemoveBeginning();
		x2 = lista.RemoveEnd();
		int sum = lista.Sum();
		int h = lista.Highest();
		int[] evenAndMultiples = lista.evenAnd5multiples();

		lista.Show();
		System.out.println("\n" + x1 + "," + x2);
		System.out.println(sum + " " + h);
		System.out.println("Even elements: " + evenAndMultiples[0]);
		System.out.println("Multiples of 5 elements: " + evenAndMultiples[1]);
		
		lista.InsertBeginning(4);
		lista.InsertBeginning(3);
		lista.InsertBeginning(2);
		lista.Show();
		lista.invertedArray();
		lista.Show();
	}

}
