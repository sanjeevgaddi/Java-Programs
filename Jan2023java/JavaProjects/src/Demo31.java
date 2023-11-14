
public class Demo31{  

	public static void main(String args[])  
	{	
		boolean bool=true;  
		String s=String.valueOf(bool);  
		System.out.println(bool);
		//2240.0 because + is binary plus operator  
		System.out.println(s+100);
		//2140.0100 because + is string concatenation operator  
	}
}  