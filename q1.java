package classwork_day_6;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int Size = sc.nextInt();
		int[] arr = new int[Size];
		int sum = 0;
		System.out.println("enter the elements in array");
		for(int i = 0; i<Size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<Size; i++) {
			sum += arr[i];
		}
		System.out.println("sum of array is "+sum);
		

	}

}
