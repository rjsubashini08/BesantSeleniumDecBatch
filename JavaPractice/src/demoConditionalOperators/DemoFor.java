package demoConditionalOperators;

public class DemoFor {
	
	public static void main(String args[])
	{
	final float initialValue=2.34F;
	final float step=0.11F;
	final float limit=4.69F;
//	float var=initialValue;
	 int counter=0;
	 for(float var=initialValue;var<limit;var+=step)//2.34<4.69|2.45<4.69|2.56<4.69|2.67<4.69|2.78<4.69|
	 {
		 //var=var+step;=2.34+0.11=2.45+0.11=2.56+.11=2.67+.11=2.78
		 counter++;//count=1+1=2+1=3+1=4
	 }
	 System.out.println("Incremnted "+counter+ " times");
}
}
