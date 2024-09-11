package exception_handling;

import java.util.Scanner;

public class Normal_Exception {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value for a");
	int a = sc.nextInt();
	System.out.println("Enter value for b");
	int b = sc.nextInt();
	int c = a/b; //operations
	System.out.println("The result is "+c);
	System.out.println("The program is terminated");

	}

}


//o/p => 12 / 4 => 3
//o/p => 12 / aa => Input Mismatched
//o/p => 10 / 0 => Arithmetic Exception
