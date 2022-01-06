package practicePrograms;

public class DemoMethodOverloading {
	//Compile Time Polymorphism
	//number of arguments, types of arguments, and order of arguments=Method Signature differes
	//return type-same(After Java version String type also its accepting
	//Access Specifier should be same
	//Method Name should be same

	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
//	public void add(int d,int e,int c)
//	{
//		System.out.println(b+a);
//	}
	
	public String add()
	{
		return null;
		
	}
	
//	public double add(int a,double b)
//	{
//		return a+b;
//	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public double add(int a,int b,int c,double d)
	{
		return a+b+c+d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoMethodOverloading methodOverload=new DemoMethodOverloading();
		System.out.println(methodOverload.add(10,20));
		System.out.println(methodOverload.add(10, 20, 30));
		System.out.println(methodOverload.add(10, 20, 30, 10.80));

	}

}
