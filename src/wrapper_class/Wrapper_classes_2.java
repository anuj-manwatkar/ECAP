package wrapper_class;

public class Wrapper_classes_2 {

	public static void main(String[] args) {
		//Scenario 2 => int, double, boolean, char ---> convert string
		
		int a = 10;       // Declare an integer variable
        double d = 10.5;  // Declare a double variable
        char c = 'A';     // Declare a char variable
        boolean booln = true; // Declare a boolean variable
        
        //1. Convert boolean --> String, Syntax: String.valueOf(boolean value)
        String s = String.valueOf(booln); // Converts the boolean value to its String representation
        System.out.println(s); // Output: true  <-- it's a string
        
        // Convert double --> String, Syntax: String.valueOf(double value)
        s = String.valueOf(d); // Converts the double value to its String representation
        System.out.println(s); // Output: 10.5  <-- it's a string 
        
        // Convert char --> String, Syntax: String.valueOf(char value)
        s = String.valueOf(c); // Converts the char value to its String representation
        System.out.println(s); // Output: A  <-- it's a string
        
        // Convert int --> String
        s = String.valueOf(a); // Converts the integer value to its String representation
        System.out.println(s); // Output: 10  <-- it's a string
	}

}
