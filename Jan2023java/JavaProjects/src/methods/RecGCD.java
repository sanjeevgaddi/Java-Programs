package methods;

public class RecGCD {
	int findGCD(int m,int n)
	{
		if(n==0)
		{
			return m;
		}
		else
		{
			return findGCD(n,m%n);
		}
	}

}
