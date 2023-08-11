package Array;

import Functions.MyIO;

public class union_and_intersection_of_elements {

	public static final int N = 5;
	public static final int M = 7;

	public static void main(String[] args) {

		int[] a1 = new int[N];
		int[] a2 = new int[M];
		int[] a3 = new int[M + N];

		System.out.println("First array: ");
		for (int i = 0; i < N; i++)
			a1[i] = MyIO.readInt("Number " + (i + 1) + ": ");

		System.out.println("Second array:");
		for (int j = 0; j < M; j++)
			a2[j] = MyIO.readInt("Number " + (j + 1) + ": ");

		union(a1, a2, a3);

		System.out.println("Union of arrays: ");
		for (int num : a3)
			System.out.println(num);
		
		int[] a4 = intersection(a1,a2);
		
		System.out.println("Intersection of arrays: ");
		for(int num : a4)
			System.out.println(num);
	}

	public static void union(int[] a1, int[] a2, int[] a3) {
		int s = 0;
		for (int i = 0; i < N; i++)
			a3[s++] = a1[i];

		for (int i = 0; i < M; i++)
			a3[s++] = a2[i];
	}

	public static int[] intersection(int[] a1, int[] a2) {
		int s4 = 0;
		int[] aux = new int[M+N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (a1[i] == a2[j]) {
					aux[s4++] = a1[i];
				}
			}
		}
		int[] a4 = new int[s4];
		
		for(int i = 0; i< s4; i++) {
			a4[i] = aux[i];
		}
		return a4;
	}

}
