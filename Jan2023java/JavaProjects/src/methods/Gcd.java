package methods;

public class Gcd {
	public int gcd1(int m,int n)
	{
		while(n!=0)
		{
			int rem=m%n;
			m=n;
			n=rem;
		}
		return m;
	}

}
