package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5]; //Declaration & Initialization
		System.out.println("Enter value for a");
		int a = sc.nextInt();
		System.out.println("Enter value for b");
		int b = sc.nextInt();
		int c = a / b; //Operation
		System.out.println("The result is "+c);
		System.out.println("Enter index value");
		int index = sc.nextInt(); //The scan.nextInt() method reads the integer input from the user and stores it in the variable index. //suppose you enter 2
		arr[index] = 5; //Assign the value 5 to the element 2 in an array //e.g. 2 so arr[2] = 5 , [0, 0, 5, 0, 0]
		System.out.println("The program is terminated normally");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}catch(InputMismatchException e) {
			System.out.println("Input Mismatch Exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception");
		}catch(Exception e) {
			System.out.println("Parent Exception occurs: Program is normal");
		}
		System.out.println("Rest of the code");
	}
}

//o/p - 1 [Input Mismatch Exception]
/*
Enter value for a
12
Enter value for b
as
Input Mismatch Exception
Rest of the code
*/


//o/p - 2 [Arithmetic Exception]
/*
Enter value for a
12
Enter value for b
0
Arithmetic Exception
Rest of the code
*/

//o/p - 3 [Array Exception]
/*
Enter value for a
12
Enter value for b
4
The result is 3
Enter index value
7
Array Exception
Rest of the code
*/

//o/p - 4
/*
Enter value for a
12
Enter value for b
4
The result is 3
Enter index value
2
The program is terminated normally
Rest of the code
*/
 