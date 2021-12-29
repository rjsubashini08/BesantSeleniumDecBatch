package practicePrograms;

public class AccessClassesMethods {

	//instance variables or NON Static 
	
	int a=10;//fields or variable or data members
	static int b=20;//static Variable
	public void method()//methods or data member functions
	{
		System.out.println("Hello I am inside the method in the class");
	}
	public void getab()
	{
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessClassesMethods acm=new AccessClassesMethods();//Objecty Creations
		acm.method();
		acm.getab();
		System.out.println("The Value of a is "+acm.a);
		acm.a=30;
		acm.b=40;
		b=60;
		System.out.println("The value of a is "+acm.a);
		System.out.println("The value of b is "+acm.b);
		
		

	}

}
