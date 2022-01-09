package demoMethodReturnType;

public class SampleReturn2 {
	 /* Method with an integer return type and arguments */  
    public int CompareNum(int x, int y)   
    {   
        System.out.println("x = " + x + "\ny = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }  
      
    /* Driver Code */  
    public static void main(String ar[])   
    {  
        SampleReturn2 obj = new SampleReturn2();  
        int result = obj.CompareNum(15,24);  
        System.out.println("The greater number among x and y is: " + result);  
    }  
}  


