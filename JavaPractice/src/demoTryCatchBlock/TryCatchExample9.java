package demoTryCatchBlock;

public class TryCatchExample9 {  
//	In this example, we handle the generated exception (Arithmetic Exception) with a different type of exception class (ArrayIndexOutOfBoundsException).



	public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
  
        }  
            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
        catch(ArithmeticException e)  
        {  
            System.out.println("Anything divide by zero"+e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  
