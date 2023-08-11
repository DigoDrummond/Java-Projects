package Array;

import Functions.MyIO;

public class if_n_is_even {

    public static void main(String[] args) {
        /*
         * Read an integer number N and N elements from an array. Then, if N is even,
         * show on the screen the sum of the 1st and 2nd element, 3rd and 4th...
         */

        int n = MyIO.readInt("Array size: ");
        int[] num = new int[n];

        for (int i = 0; i < n; i++)
            num[i] = MyIO.readInt("Number " + (i + 1) + ": ");

        int[] sum = new int[n/2];
        if (n % 2 == 0) {
            for (int i = 0; i < n-1; i += 2) {
                    sum[i/2] = num[i] + num[i + 1];
            }
        } else {
            System.out.println("Since " + n + " is an odd number, you can't do the rest of the operations!");
            return;
        }

        for (int numbers : sum)
            System.out.println(numbers);
    }
}
