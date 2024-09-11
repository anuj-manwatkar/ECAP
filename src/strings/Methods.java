package strings;

public class Methods {

	public static void main(String[] args) {
		String str1 = "Anuj";
		String str2 = "anuj";
		String str3 = "anuj@123";
		String str4 = "Hello I am Java";
		String str5 = "       Hello java, I am Learning Java Course       ";
		String str6 = "Welcome";
		
		//To calculate length of string
		System.out.println(str1.length());
		
		//To convert string to uppercase
		System.out.println(str1.toUpperCase());
		
		//To convert string to lowercase
		System.out.println(str1.toLowerCase());
		
		//Method-1 => To combine string => + operator
		System.out.println(str1+" "+str2);
		
		//Method-2 => To concatinate string => .concat() method
		System.out.println(str1.concat(" ").concat(str2));
		
		//To ignore the case of data for(whether upper case or lower case) i.e. Str1 = "Anuj"; Str2 = "anuj"; => equalsIgnoreCase()
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Data is Same");
		}else {
			System.out.println("Data is Different");
		}
		
		//To check whether a string contains sequence of character or not. If same sequence of char true; else false => contains()
		System.out.println(str1.contains("Anu")); //return true
		System.out.println(str2.contains("auj")); //return false
		System.out.println(str3.contains("an@123")); //return false
		
		//To find the string for a specific value and it replace specific value and return the same => replace()
		System.out.println(str4.replace("Java", "Anuj"));
		
		//To Remove spaces from prior(left) and after(Right) the string => trim()
		System.out.println(str5.trim());
		
		//To extract sub strings from main string substring() 
		//e.x: String = "Welcome"
		//Index    W e l c o m e
		//         0 1 2 3 4 5 6  => Starting Index[SI]       <= Thumb Rule
		//         W e l c o m e
		//         1 2 3 4 5 6 7  => [EI]
		// com => (3,6) it will print com
		System.out.println(str6.substring(3, 6)); //com(3,6)
		System.out.println(str6.substring(0, 3)); //wel(1,3)

	}

}
