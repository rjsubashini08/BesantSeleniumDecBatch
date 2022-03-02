package demoDataTypesArrays;

public class DemoWrapperClass {
//Wrapper classes otherwise known as Non Primitive DatatType or References or objects
//byte short int long float double boolean char ***PRMITIVE DATA TYPE
//Byte Short Integer Long Float Double Boolean Character String *****NON PRIMITIVE DATA TYPE
	
	
	//Casting- conversion of 1 data type to another data type is called Casting
	//Boxing(P to NP) or Unboxing(NP to P)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;//Primitive DataType
		Integer ia=Integer.valueOf(a);//BOXING
		Integer j=a;//AUTOBOXING
		System.out.println(a);
		System.out.println(ia);
		System.out.println(j);
		
		Integer in=10000;//Non Primitive DatatType
		int ii=in;//Uboxing directly Automatically
		int iic=in.intValue();//Unboxing explictly through methods
		System.out.println(ii);
		System.out.println(iic);
		
		
		float f=10.5F;
		Float ff=Float.valueOf(f);
		System.out.println(f);
		System.out.println(ff);
		
		String s=new String("Hello");
		System.out.println(s);

	}

}
