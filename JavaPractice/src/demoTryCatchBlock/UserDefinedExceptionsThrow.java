package demoTryCatchBlock;


 class UserDefinedExceptionsThrowDemo extends Exception
{
	
	public UserDefinedExceptionsThrowDemo(String str)
	{
		super(str);
	}

	
}
public class UserDefinedExceptionsThrow
{
	
public static void main(String args[])  
{  
    try  
    {  
        // throw an object of user defined exception  
        throw new UserDefinedExceptionsThrowDemo("This is user-defined exception");  
    }  
    catch (UserDefinedExceptionsThrowDemo ude)  
    {  
        System.out.println("Caught the exception");  
        // Print the message from MyException object  
        System.out.println(ude.getMessage());  
    }  
}  
} 