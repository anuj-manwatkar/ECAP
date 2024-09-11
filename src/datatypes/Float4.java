package datatypes;

public class Float4 {

	public static void main(String[] args) {
		//default value = 0.0F
		
/*		float LargeNumber = 100000f;
		
		System.out.println(LargeNumber);
*/
		
/*		float LargerNumber = 1000000f;
		
		if(LargerNumber > 5000000000L) {
			System.out.println("The Number is Very Large");
		} else {
			System.out.println("The Number is very Small");
		}
*/
		
		float LargerNumber = 10L;
		float SmallerNumber = 20L;
		
		System.out.println(LargerNumber + SmallerNumber);
		
		System.out.println(LargerNumber - SmallerNumber);
		
		System.out.println(LargerNumber * SmallerNumber);
		
		System.out.println(LargerNumber / SmallerNumber);
		
		System.out.println(LargerNumber % SmallerNumber);
		
	}

}
