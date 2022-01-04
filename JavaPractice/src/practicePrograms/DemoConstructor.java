package practicePrograms;

public class DemoConstructor {
	
	//Constructor is the method whose class name and method name should be same
	//constructor always have public access specifier
	//Constructor should not have any return type
	//constructor can have arguments and that argument used to initialize the instance variable
	//during object creation we can initialize the instance variable
	//constructor overloading-same method name,same access specifier only arguments differs
	
	//Instance Variable
	
	int a;
	int b;
	int c;
	int d;
	
	public DemoConstructor(int vala,int valb)
	{
		a=vala;
		b=valb;
			
	}
	
	public DemoConstructor(int vala,int valb,int valc)
	{
		a=vala;
		b=valb;
		c=valc;
			
	}
	
	public DemoConstructor(int vala,int valb,int valc,int vald)
	{
		a=vala;
		b=valb;
		c=valc;
		d=vald;
			
	}
	
	public void printValues()
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	public void printValues2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public void printValues3()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoConstructor dcobj=new DemoConstructor(10,20);
		DemoConstructor dcobj1=new DemoConstructor(10,20,30);
		DemoConstructor dcobj2=new DemoConstructor(10,20,30,40);
		
		dcobj.printValues();
		dcobj1.printValues2();
		dcobj2.printValues3();

	}

}
