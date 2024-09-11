package exception_handling;

import java.util.Scanner;

public class Exception_Handling {
	public static void main(String[] args) {
		try { //try => when may cause problem
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value or a");
		int a = sc.nextInt();
		System.out.println("Enter value for b");
		int b = sc.nextInt();
		int c = a / b; //operation
		System.out.println("The result is "+c);
		}catch(Exception e) { //catch => when error occurs Exception object is created and object thrown it, and to catch thrown object, we use catch block
		System.out.println("The program is Terminated");
		System.out.println("The program is Executed");
		}
	}

}

//o/p 
/*
Enter value or a
12
Enter value for b
ad
The program is Terminated
The program is Executed 
 */
