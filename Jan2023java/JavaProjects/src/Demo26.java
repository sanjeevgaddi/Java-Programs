
public class Demo26{  

	public static void main(String args[])  
	{	
		int i=214;  
		String s=String.valueOf(i);  
		System.out.println(i+100);
		//314 because + is binary plus operator  
		System.out.println(s+100);
		//314100 because + is string concatenation operator  
	}
}  