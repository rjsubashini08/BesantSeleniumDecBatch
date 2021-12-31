package practicePrograms;

public class VariableScopeExample1 {
	
	//Instance Variable NON Static Variable
	
	int instanceVar=100;
	
	//Class Variable Static
	static int staticVar=200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Local Variable
		int x=10;
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
			
			System.out.println("Instance Variable = " +obj.instanceVar);
//			System.out.println("Instance Variable = " +instanceVar);
			
			System.out.println("Static Variable = " +staticVar);
			
			
			
			
			}  
	
	
	
	
	
	}


