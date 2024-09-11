package strings;

public class NonConstantPole_CompAdd {

	public static void main(String[] args) {
		//Comparing address of two String variables => == operator i.e. equals to operator
		
		String str1 = new String("Anuj"); //with new keyword => Non constant pole, i.e Duplicates are allowed //A-1000
		String str2 = new String("Anuj");                                                                    //A-2000
		//String str3 = new String("AnujM");
		
		if(str1 == str2) {
			System.out.println("Address is Same");
		}else {
			System.out.println("Address is Different");
		}
	}

}

//note - 1. with new keyword => fall and down into [Non Constant Pole]
//     - 2. Same String => [Duplicates are allowed], address will be different. - i.e. if, str1 = "Anuj"(1000), str2 = "Anuj"(2000)
//     - 3. Different String or Same String => New address will allocate in Non Constant Pole. i.e. if, str1 = "Anuj"(3000), str3 = "AnujM"(4000) 
