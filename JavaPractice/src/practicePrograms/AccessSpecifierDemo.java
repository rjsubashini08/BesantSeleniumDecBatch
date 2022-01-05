package practicePrograms;

import secondPackage.DifferentPackageAccessSpecifier;

class privateDemo
{
	
	  int error;
//	  int defaulterror=100;
//	  
//	  void defaultmethod()
//	  {
//		  System.out.println("I am inside default method");
//	  }
	
}
public class AccessSpecifierDemo {
	//default 
	
	int sameclassdefault=100;
	void sameclassdefault()
	{
		System.out.println("I am inside same class default method "+ sameclassdefault);
	}
	//Access Specifier can be apply to variable method class and constructor
	//Private,public,protected,default
	
	 private int a=100;//Private variable can access onlty within the class not outside of the class
	 
	 private void privateMethod()
	 {
		 System.out.println("I am inside the private method");
	 }
	
	 
	 //Protected Members
	 
	 protected int protectvar=100;
	 protected void protectedmethod()
	 {
		 System.out.println("I am inside protected method"+protectvar);
	 }
	public static void main(String args[])
	{
		AccessSpecifierDemo asd=new AccessSpecifierDemo();
		System.out.println(asd.a);
		asd.privateMethod();
		System.out.println(asd.sameclassdefault);
		asd.sameclassdefault();
		
		//Accessing the Protected  Members in same class
		System.out.println(asd.protectvar);
		asd.protectedmethod();
		
		
		
		privateDemo pd=new privateDemo();
		System.out.println(pd.error);
		
		DefaultDemo dd=new DefaultDemo();
		System.out.println("Default Variable "+dd.defaulterror);
		dd.defaultmethod();
		
		//Accessing the Protected  Members in different class with subclass
		System.out.println(dd.protectvarsubclass);
		dd.protectedmethodsubclkass();
		
		//Accessing the Protected  Members in different class with NON subclass
		AnotherClass ac=new AnotherClass();
				System.out.println(ac.protectvarNONSubclass);
				ac.protectedmethodNonsubclkass();
		
		//Object with diffrent package class
		
		DifferentPackageAccessSpecifier dpas=new DifferentPackageAccessSpecifier();
//		dpas.DifPackdefaulterror;
//		dpas.DifPackdefaultmethod();
		
		//Accessing the Protected  Members in different class of different package with subclass
		System.out.println(dpas.protectvar);
		dpas.protectedmethod();
		
		
		
	}

}
