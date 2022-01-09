package demoConditionalOperators;

public class ConditionalOperatorExample {
//&&(X)(If any 1 is false result false)  ||(+) -If both condition false then False  !    (true it will return thr first failes means second value)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5, y=4, z=7;  
		System.out.println(x>y && x>z || y<z);  //T && F || T=F||T=T
		System.out.println((x<z || y>z) && x<y);  //(T || F )&&F=T&&F=F
		
		
		//Trernary OpratoR ?:
		
		int xt, yt;  
		xt = 20;  
		yt = (xt == 1) ? 61: 90;  
		System.out.println("Value of yt is: " +  yt);  
		yt = (xt == 20) ? 61: 90;  
		System.out.println("Value of yt is: " + yt);  

	}

}
