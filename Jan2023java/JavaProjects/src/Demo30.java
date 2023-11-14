
public class Demo30{  

	public static void main(String args[])  
	{	
		char ch='A';  
		String s=String.valueOf(ch);  
		System.out.println(ch+100);
		//2240.0 because + is binary plus operator  
		System.out.println(s+100);
		//2140.0100 because + is string concatenation operator  
	}
}  