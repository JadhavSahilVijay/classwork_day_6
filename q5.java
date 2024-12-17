package classwork_day_6;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int Size = sc.nextInt();
		int[] arr = new int[Size];
		int[] arr2 = new int[Size];
		int[] arr3 = new int[Size];
		
		System.out.println("enter the element in first array");
		for(int i = 0; i<Size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element in secound array");
		for(int i = 0; i<Size; i++) {
			arr2[i] = sc.nextInt();
		}
		for(int i = 0; i<Size; i++) {
			arr3[i] = arr[i]+arr2[i];
		}
		System.out.println("third array is : ");
		for(int i = 0; i<Size; i++) {
			System.out.println(arr3[i]);
		}
	}

}
