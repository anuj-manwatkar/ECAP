package wrapper_class;

public class Wrapper_classes_1 {

	public static void main(String[] args) {
		//Scenario 1 => convert string ---> int, double, boolean 
		//1. string --> int  Syntax: Integer.parseInt(string value)
		//note: string does not belong to wrapper class, usually we read the data and store it into string format, so that we required Wrapper Class (to convert one to another form)
		String s = "welcome"; //cannot convert string to int
		
		String s1 = "10";
		String s2 = "40";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));   //o/p => 30
		
		
		//2. string --> double   Syntax: Double.parseDouble(string value)
		String s3 = "10.45";
		String s4 = "40.67";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4)); //o/p => 51.120000000000005
		
		
		//3. string --> boolean  Syntax: Boolean.parseBoolean(string value)
		//note: other than true => return false
		String s5 = "true";  //other than true, e.g. tyfh it will return false
		System.out.println(Boolean.parseBoolean(s5)); //o/p => true

	}

}
