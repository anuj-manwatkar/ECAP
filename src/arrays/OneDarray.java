package arrays;

import java.util.Scanner;

public class OneDarray {

	public static void main(String[] args) {
		//Array = 1). 1-Dimensional Array
		
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Numbers");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("The 1-D array are : "+arr[i]);
		}
		

	}

}
