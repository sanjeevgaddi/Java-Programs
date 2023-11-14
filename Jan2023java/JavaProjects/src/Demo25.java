
public class Demo25{  

	public static void main(String args[])  
	{	
		short sh=32500;  
		String s=String.valueOf(sh);  
		System.out.println(sh+100);
		//32600 because + is binary plus operator  
		System.out.println(s+100);
		//32500100 because + is string concatenation operator  
	}
}  