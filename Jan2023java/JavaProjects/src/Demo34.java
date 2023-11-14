
public class Demo34 {
	public static void main(String[] Args)
	{
		StringBuffer sb=new StringBuffer();
		sb.ensureCapacity(70);
		System.out.println(sb.capacity());
		System.out.println("====================");
		StringBuilder sb1=new StringBuilder(70);
		System.out.println(sb1.capacity());
		
	}

}
