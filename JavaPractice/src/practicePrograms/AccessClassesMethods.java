package practicePrograms;

public class AccessClassesMethods {

	//instance variables
	
	int a=10;//fields or variable or data members
	public void method()//methods or data member functions
	{
		System.out.println("Hello I am inside the method in the class");
	}
	public void geta()
	{
		System.out.println("The value of a is "+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessClassesMethods acm=new AccessClassesMethods();//Objecty Creations
		acm.method();
		acm.geta();
		

	}

}
