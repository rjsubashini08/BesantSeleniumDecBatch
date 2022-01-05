package practicePrograms;

class Animal
{
	
	//Cast means conversion of one DataType/Object to another
	
	//RunTime Polymorphism
	public int eat()
	{
		System.out.println("Animal Eating");
		return 0;
	}
}

class Dog extends Animal
{
	public int eat()
	{
		System.out.println("Dog Eating");
		return 0;
	}
}

public class DemoMethodOverriding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dg=new Dog();//Overriden
		dg.eat();
		Animal a=new Animal();
		a.eat();
		
		Animal as=new Dog();//overideen
		as.eat();
		
//		Dog d1=(Dog) new Animal();
//		d1.eat();

	}

}
