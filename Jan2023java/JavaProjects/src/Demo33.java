
public class Demo33 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Prahallad is a Batsman");
		System.out.println(sb.capacity());
		sb.append("He lives in chennai");
		System.out.println(sb.capacity());
		System.out.println("==========================");
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.capacity());
		sb1.append("Prahallad is a Batsman");
		System.out.println(sb1.capacity());
		sb1.append("He lives in chennai");
		System.out.println(sb1.capacity());
		

	}

}
