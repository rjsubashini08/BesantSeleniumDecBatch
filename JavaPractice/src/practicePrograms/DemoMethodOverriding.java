package practicePrograms;

class Animal
{
	public int eat()
	{
		System.out.println("Animal Eating");
		return 0;
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog Eating");
	}
}

public class DemoMethodOverriding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dg=new Dog();
		dg.eat();

	}

}
