public class Demo9{

	public static void main(String[] args) {
		String s1="om";
		String s2="kar";
		String s3=s1+s2;
		String s4=s1+s2;
		if(s3==s4)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		System.out.println("********************************");
		if(s3.equals(s4))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
	}
}
