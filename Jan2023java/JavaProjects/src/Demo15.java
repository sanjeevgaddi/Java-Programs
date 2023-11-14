public class Demo15 {
	public static void main(String[] args) {
		String s1=new String("SANJEEV");
		String s2=new String("sanjeev");
	    if(s1.compareToIgnoreCase(s2)>0)
	    	System.out.println("string s1 greater");
	    else if(s1.compareToIgnoreCase(s2)<0)
	    	System.out.println("string s2 greater");
	    else
	    	System.out.println("both Strings are equal");
	    System.out.println("================================");
        if(s1.endsWith("V"))
        	System.out.println("True");
        else
        	System.out.println("False");
        System.out.println("================================");
        if(s1.startsWith("V"))
        	System.out.println("True");
        else
        	System.out.println("False");
        System.out.println("================================");
        int s3=s2.lastIndexOf('e');
        System.out.println(s3);
        System.out.println("================================");
        int s4=s1.length();
        System.out.println(s4);
        System.out.println("================================");
        String s5=s1.replace('S', 'R');
        System.out.println(s5);
        System.out.println("================================");
        String s6=s1.replaceAll(s1, "SACHIN");
        System.out.println(s6);
        System.out.println("================================");
        String s7=new String("my name is sanjeev");
        String s8=s7.replaceFirst("eev","u");
        System.out.println(s8);
        System.out.println("================================");
        String s9=new String("my name is sanjeev");
        String arr[]= s9.split(" ");
        for(int i=0;i<=arr.length-1;i++)
        {
        	System.out.println(arr[i]+" ");
        }
        	 
        System.out.println("================================");
        
	}

}
