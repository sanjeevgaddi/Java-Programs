public class Demo11{

	public static void main(String[] args) {
		String s1="Sanjeev";
		String s2="sanjeev";
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		System.out.println("********************************");
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal if cases are ignored");
		}
		else
		{
			System.out.println("Strings are unequal even if cases are ignored");
		}
	}
}
