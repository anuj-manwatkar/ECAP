package strings;

public class NonConstantPole_CompData {

	public static void main(String[] args) {
		//Comparing data of two two String variables => .equals() method
		
		String str1 = "Anuj"; //Without new keyword => Constant pole
		String str2 = new String("Anuj"); //With new keyword => Non Constant pole
		
		if(str1.equals(str2)) {
			System.out.println("Data is Same");
		}else {
			System.out.println("Data is Different");
		}
		//o/p => data is same, because: both data is same 
		
		
		//Comparing address of two String variables => == operator. i.e. equals too operator
		
		if(str1 == str2) {
			System.out.println("Address is Same");
		}else {
			System.out.println("Address is Differnt");
		}
		//o/p => address is different, even the data is same [because: str1 - Without new keyword(Constant pool) & With new Keyword(Non-constant pool)]  
	}

}
