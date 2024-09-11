package arrays;

import java.util.Scanner;

public class TwoDarray_UserI {

	public static void main(String[] args) {
		int arr[][] = new int[2][2];   //array declaration
		Scanner sc = new Scanner(System.in);   //Scanner class for user input
		
		for(int i = 0; i < arr.length; i++) { //i represents => rows
			//arr[i].length => here arr[i] - go to rows & .length - calculate the column
			for(int j = 0; j < arr[i].length; j++) { //j represents => column 
				System.out.print("Enter the Elements ["+i+"] ["+j+"] : ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("The Entered Elements of Array are : ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("[["+arr[i][j]+"]]");
			}
			System.out.println();  //to move next line after each rows get execute
		}
		sc.close();
	}
}
