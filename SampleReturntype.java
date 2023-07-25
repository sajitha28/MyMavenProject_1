package Sample;

public class SampleReturntype {
	
		static byte y=90;
		
	public static int add()
	{
	int a=20;
	int b=30;
	int c=a+b;
	return c;
	}
	public static String details(String name,int x)
	{
		System.out.println(x);
		return(name);
		
	}
	public static float  floatcharacter(char c, float f)
	{
		System.out.println(c);
		return f;
	}
	public static byte bytevalue( )
	{
		return y;
	}

	public static void main(String args[])
	{
	System.out.println(SampleReturntype.add());
	//System.out.println("Tina",8);
	System.out.println(SampleReturntype.details("Tina",8));
	System.out.println(SampleReturntype.floatcharacter('d',8.2f));
	System.out.print(SampleReturntype.bytevalue());
	}
	}
	


