package practicePrograms;


 class Employee
{
	float salary;
	
	public void readPrintSalary()
	{
		salary=30000;
		System.out.println("Employee Salary is "+salary);
	}
}

class Programmer extends Employee
{
int bonus;
	
	public void readPrintBonus()
	{ bonus=10000;
		System.out.println("Programmer Bonus Amount is "+bonus);
	}
	
}

public class DemoSingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer prog=new Programmer();
		prog.readPrintSalary();
		prog.readPrintBonus();

	}

}