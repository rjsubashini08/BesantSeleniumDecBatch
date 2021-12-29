package practicePrograms;

public class DemoMethodOverloading {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public double add(int a,double b)
	{
		return a+b;
	}
	
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
