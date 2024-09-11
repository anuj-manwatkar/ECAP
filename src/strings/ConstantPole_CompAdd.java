package strings;

public class ConstantPole_CompAdd {

	public static void main(String[] args) {
		//Comparing address of two String variables => == operator. i.e. equals to operator
		
		String str1 = "Anuj"; //without new keyword => Constant pole //A-1000
		String str2 = "Anuj";                                       //A-1000
		//String str3 = "AnujM";
		
		if(str1 == str2) {
			System.out.println("Address is Same");
		}else {
			System.out.println("Address is Different");
		}

	}

}

//note - 1. without new keyword => fall and down into [Constant Pole]
//     - 2. Same String => [Duplicates are not allowed], address will be same. - i.e. if, str1 = "Anuj"(1000), str2 = "Anuj"(1000)
//     - 3. Different String => New address will allocate in Constant Pole. i.e. if, str1 = "Anuj"(1000), str3 = "AnujM"(2000) 
