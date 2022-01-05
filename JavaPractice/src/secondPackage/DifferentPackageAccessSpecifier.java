package secondPackage;

import practicePrograms.AccessSpecifierDemo;

public class DifferentPackageAccessSpecifier extends AccessSpecifierDemo {

	 int DifPackdefaulterror=100;
	  
	  void DifPackdefaultmethod()
	  {
		  System.out.println("I am inside default method of different Package");
	  }
	  
	  
 protected int DifPackProtecterror=100;
	  
	 protected void DifPackProtecttmethod()
	  {
		  System.out.println("I am inside protected method of different Package with subclass");
	  }

}
