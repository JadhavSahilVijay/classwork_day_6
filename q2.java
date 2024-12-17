package classwork_day_6;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int Size = sc.nextInt();
		int[] arr = new int[Size];
		System.out.println("enter the elements in array");
		for(int i = 0; i<Size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element to search in array");
		int x = sc.nextInt();
		boolean found = false; 
		for(int i = 0; i<Size; i++) {
			if(arr[i]==x) {
				System.out.println(x+" is at "+i+" position");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println(x+" is not present in array");
		}
	}

}
