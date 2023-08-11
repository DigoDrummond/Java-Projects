package While;

import Functions.MyIO;

public class show_sequence_before_N {

	public static void main(String[] args) {
		//Read a number N and show the first N numbers of this sequence.
		//1, 5, 12, 16, 23, 27 34.
		
		int N = MyIO.readInt("Enter the max of the sequence: ");
		int count = 0;
		int sequence = 1;
		while(count < N) {
			sequence += 4;
			System.out.println(sequence);
			sequence += 7;
			System.out.println(sequence);
			count++;
		}
	}

}
