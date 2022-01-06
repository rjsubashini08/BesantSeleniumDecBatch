package demoTryCatchBlock;

public class TryCatchExample8 {  
//	Let's see an example to handle checked exception.
	public static void main(String[] args) {  
        try  
        {  
        int arr[]= {1,3,5,7}; 
        int a=10;
        System.out.println(arr[10]); //may throw exception   
        }  
            // handling the array exception  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}    
