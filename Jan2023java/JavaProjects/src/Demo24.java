
public class Demo24{  

	public static void main(String args[])  
	{	
		byte b=27;  
		String s=String.valueOf(b);  
		System.out.println(b+100);
		//127 because + is binary plus operator  
		System.out.println(s+100);
		//27100 because + is string concatenation operator  
	}
}  