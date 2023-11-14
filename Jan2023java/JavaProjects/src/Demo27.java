
public class Demo27{  

	public static void main(String args[])  
	{	
		long l=2140;  
		String s=String.valueOf(l);  
		System.out.println(l+100);
		//2240 because + is binary plus operator  
		System.out.println(s+100);
		//2140100 because + is string concatenation operator  
	}
}  