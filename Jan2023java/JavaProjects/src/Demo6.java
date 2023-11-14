
public class Demo6 {

	public static void main(String[] args) {
		String s1="Sanjeev";
		String s2=new String("Sanjeev");
		if(s1==s2)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		System.out.println("********************************");
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}

	}

}
