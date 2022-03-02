package practicePrograms;

public class VariableScopeExample1 {
	
	//Instance Variable NON Static Variable
	
	public VariableScopeExample1()
	{
		int consts=900;
	}
	
	int instanceVar=100;
	
	//Class Variable Static
	static int staticVar=200;
	
	public void display()
	{
		 int xlocal=700;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Local Variable
		int x=10;
		
		//Block
		{  
			//y has limited scope to this block only      
			int y=20;  
			System.out.println("Sum of x+y = " + (x+y));  
		}  
			//here y is unknown   
//			y=100;  
			//x is still known  
			x=50;  
			
			System.out.println("x = " + x);
			
			//Instance and STatic Variable
			//Object 
			VariableScopeExample1 obj=new VariableScopeExample1();
			VariableScopeExample1 obj1=new VariableScopeExample1();
			VariableScopeExample1 obj2=new VariableScopeExample1();
			
			System.out.println("Instance Variable = " +obj.instanceVar);
//			System.out.println("Instance Variable = " +instanceVar);
			
			System.out.println("Static Variable = " +staticVar);
			
			
			
			
			}  
	
	
	
	
	
	}


