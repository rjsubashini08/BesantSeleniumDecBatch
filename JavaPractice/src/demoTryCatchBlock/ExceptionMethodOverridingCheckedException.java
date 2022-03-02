package demoTryCatchBlock;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Parent{   
	  
	  // defining the method   
	  void msg() {  
	    System.out.println("parent method");  
	    }    
	}    
public class ExceptionMethodOverridingCheckedException extends Parent {
	// overriding the method in child class  
	  // gives compile time error  
	  void msg() throws SQLException {    
	    System.out.println("TestExceptionChild");    
	  }  
	  public static void main(String args[]) {    
		   Parent p = new ExceptionMethodOverridingCheckedException();    
		   p.msg();    
		  }    
		  

	  
}
