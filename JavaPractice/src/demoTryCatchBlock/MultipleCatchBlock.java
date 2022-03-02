package demoTryCatchBlock;

public class MultipleCatchBlock {
	public static void main(String args[]){    
		   try{    
		    int a[]=new int[5]; //Array/index based stored Varible going to store 5 elements
		    //a[0]=10,a[1]=20,a[2]=30,a[3]=40,a[4]=50
		    
//		    int b=10;
		    a[5]=30;    
		   }    
		 
		   catch(ArithmeticException e){System.out.println("task1 is completed");}    
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
		   catch(Exception e){System.out.println("common task completed");}  
		   System.out.println("rest of the code...");    
		 }    
		}  
