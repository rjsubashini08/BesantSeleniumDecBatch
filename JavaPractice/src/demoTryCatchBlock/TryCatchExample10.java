package demoTryCatchBlock;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample10 {  
//Let's see an example to handle checked exception.


	
	public static void main(String[] args) {  
        
        
        PrintWriter pw;  
        try {  
//            pw = new PrintWriter("C:\\Users\\Sony\\Desktop\\Demo\\jtp.txt"); //may throw exception   
            pw = new PrintWriter("C:\\jtp.txt"); //may throw exception   

            pw.println("saved");  
        }  
// providing the checked exception handler  
 catch (FileNotFoundException e) {  
              
            System.out.println("File Not found in C Drive"+e);  
        }         
    System.out.println("File saved successfully");  
    }  
}  