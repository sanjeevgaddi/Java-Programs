
public class Demo35 {

	public static void main(String[] args) {
		String s1=new String("Kodnest Technologies pvt Ltd");
		System.out.println(s1);
		System.out.println("============================");
		String arr[]=s1.split(" ");
		
		
		//We can use for each loop(Enhanced for loop) for i
		for(String s:arr)
		{
			System.out.println(s);
		}

	}

}
