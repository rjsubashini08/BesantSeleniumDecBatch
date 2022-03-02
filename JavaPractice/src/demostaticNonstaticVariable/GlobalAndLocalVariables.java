package demostaticNonstaticVariable;

class GlobalAndLocalVariables
{
	
	//Instance and Global/Static vartiable can take default values
	//Local Variable cant take default valiues it will throw error
     static boolean globalVariable;
     int a;//instance
     static void methodOne()
     {
          int localToMethodOne=10;
          System.out.println(localToMethodOne);
          System.out.println(globalVariable);
    //    System.out.println(localToMain);
     }
 
     public static void main(String[] args)
     {
    	 
    	 GlobalAndLocalVariables g=new GlobalAndLocalVariables();
    	 GlobalAndLocalVariables g1=new GlobalAndLocalVariables();
    	 GlobalAndLocalVariables g2=new GlobalAndLocalVariables();
          int localToMain = 0;
          System.out.println(localToMain);
          System.out.println(globalVariable);
          g.methodOne();
//        System.out.println(localToMethodOne);
     }
}
