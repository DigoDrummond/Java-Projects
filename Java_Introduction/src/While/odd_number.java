package While;

import Functions.MyIO;

public class odd_number {

	public static void main(String[] args) {
		int odd = MyIO.readInt("Enter a number to see how many odd numbers exist befora him: ");
		int count = 0;
		while(count<odd) {
			count++;
			if(count % 2 != 0) {
				System.out.println(count);
			}
		}
	}

}
