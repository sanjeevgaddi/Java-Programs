
public class Demo29{  

	public static void main(String args[])  
	{	
		double d=2140.23;  
		String s=String.valueOf(d);  
		System.out.println(d+100);
		//2240.23 because + is binary plus operator  
		System.out.println(s+100);
		//2140.23100 because + is string concatenation operator  
	}
}  