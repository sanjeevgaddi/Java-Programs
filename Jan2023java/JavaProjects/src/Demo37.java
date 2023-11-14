
public class Demo37 {

	public static void main(String[] args) {
		String s1=new String("Kodnest Technologies pvt Ltd");
		System.out.println(s1);
		System.out.println("============================");
		
		char[] arr=s1.toCharArray();
		
		//We can use for each loop(Enhanced for loop) for i
		for(char s:arr)
		{
			System.out.println(s);
		}

	}

}
