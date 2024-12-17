package classwork_day_6;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int Size = sc.nextInt();
		int[] arr = new int[Size];
		int[] squre = new int[Size];
		int[] cube = new int[Size];
		System.out.println("enter the elements in array");
		for(int i = 0; i<Size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<Size; i++) {
			squre[i] = arr[i]*arr[i];
			cube[i] = arr[i]*arr[i]*arr[i];
		}
		for(int i = 0; i<Size; i++) {
			System.out.println("elements = "+arr[i]);
			System.out.println("Square = "+squre[i]);
			System.out.println("Cube = "+cube[i]);
		}

	}

}
