package datatypes;

public class Boolean1 {

	public static void main(String[] args) {
		//default value = false
		
/*		boolean age = false;
		
		if(age) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not Eligible to vote");
		}
*/
		
		boolean JavaisEasy = true;
		boolean JavaisHard = true;
		
		if((JavaisEasy) && (JavaisHard)) {
			System.out.println("Excellent");
		}else if(JavaisEasy || JavaisHard) {
			System.out.println("Very Good");
		} else {
			System.out.println("Good");
		}
	}

}
