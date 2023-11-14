
public class Demo28{  

	public static void main(String args[])  
	{	
		float f=2140.23f;  
		String s=String.valueOf(f);  
		System.out.println(f+100);
		//2240.23 because + is binary plus operator  
		System.out.println(s+100);
		//2140.23100 because + is string concatenation operator  
	}
}  