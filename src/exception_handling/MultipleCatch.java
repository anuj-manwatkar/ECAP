package exception_handling;

public class MultipleCatch {

	public static void main(String[] args) {
		  try{    
              String s=null;  
              System.out.println(s.length());  
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }             
             System.out.println("rest of the code");    

	}

}


//o/p
/*
Parent Exception occurs
rest of the code
*/