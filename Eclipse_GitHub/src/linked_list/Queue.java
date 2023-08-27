package linked_list;

//fifo, first in, first out
//who gets in first, gets out first
public class Queue {

	private int[] array;
	private int n;
	
	Queue(){
		array = new int[10];
	    n =0;
	}
	Queue(int size) {
		array = new int[size];
		n = 0;
	}
	
	void Enqueue(int value) {//insert at ending, idx n
		if (n >= array.length) {
			System.out.println("Error: Queue is full!");
			return;
		}
		array[n] = value;
		n++;
		
	}
	void Dequeue() {// remove firts element, idx 0
		if (n == 0) {
			System.out.println("Empty queue!");
			System.exit(0);
		}
		n--;
		for(int i =0; i< n;i++) {
			array[i] = array[i+1];
		}
		
	}
	void Show() {
		for(int i=0;i<n;i++) {
			System.out.printf(" %d, ", array[i]);
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.Enqueue(1);
		queue.Enqueue(2);
		queue.Enqueue(3);
		queue.Enqueue(4);
		queue.Show();
		queue.Dequeue();
		queue.Show();
	}

}
