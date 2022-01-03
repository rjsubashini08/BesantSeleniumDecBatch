package practicePrograms;

class privateDemo
{
	
	  int error;
	
}
public class AccessSpecifierDemo {
	
	//Access Specifier can be apply to variable method class and constructor
	//Private,public,protected,default
	
	 private int a=100;//Private variable can access onlty within the class not outside of the class
	 
	 private void privateMethod()
	 {
		 System.out.println("I am inside the private method");
	 }
	
	public static void main(String args[])
	{
		AccessSpecifierDemo asd=new AccessSpecifierDemo();
		System.out.println(asd.a);
		asd.privateMethod();
		
		privateDemo pd=new privateDemo();
		System.out.println(pd.error);
		
	}

}
