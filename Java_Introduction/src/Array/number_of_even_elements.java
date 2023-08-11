package Array;

import Functions.MyIO;

public class number_of_even_elements {

	public static void main(String[] args) {
		/*Read an integer N and N elements from a
		array. Then calculate and display the number of even elements and the number of
		divisible by three.*/
		
		int n = MyIO.readInt("Array size: ");
        int[] num = new int[n];

        for (int i = 0; i < n; i++)
            num[i] = MyIO.readInt("Number " + (i + 1) + ": ");
        
        int evenNumbers = 0;
        int divisibleByThree = 0;

        for (int i = 0; i < n; i++) {
        	if(num[i] % 2 == 0)
        		evenNumbers++;
        }
        
        for (int i = 0; i < n; i++) {
        	String str = String.valueOf(num[i]);//int on string
        	int sum = 0;
        	for(int j = 0; j < str.length(); j++) {
        		char digitChar = str.charAt(j);//string on char
        		int digit = Character.getNumericValue(digitChar);//char into int
        		sum += digit;
        	}
        	if(sum % 3 == 0)
        		divisibleByThree++;
        }
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Divisible by 3 numbers: " + divisibleByThree);
	}

}
