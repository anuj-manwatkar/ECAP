package strings;

public class ConstantPole_CompData {

	public static void main(String[] args) {
		//Comparing data of two string variables data => .equals() method 
		
		String str1 = "Anuj"; //without new keyword => Constant Pole  i.e. String data check - Anuj = Anuj - (same) else, different
		String str2 = "aanuj";
		
		if(str1.equals(str2)) {
			System.out.println("Data is Same");
		}else {
			System.out.println("Data is Different");
		}

	}

}
