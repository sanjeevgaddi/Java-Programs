
public class Demo32 {

	public static void main(String[] args) {
		//Mutable string using string buffer
		StringBuffer sb =new StringBuffer("Raja Ram");
		System.out.println(sb);
		sb.append("Mohan Roy");
		System.out.println(sb);
		System.out.println("==========================");
		//Mutable string using string builder
		StringBuilder sbu=new StringBuilder("Kodnest");
		System.out.println(sbu);
		sbu.append("Technologies");
		System.out.println(sbu);

	}

}
