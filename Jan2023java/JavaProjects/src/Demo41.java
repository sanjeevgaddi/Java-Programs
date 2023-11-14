import java.util.Scanner;

class Demo41 {
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();
        
        String arr1[]=str.split(" ");
        String revSentence="";
        
        for(int i=0;i<=arr1.length-1;i++)
        {
        	 String word=arr1[i];
        	 String revWord="";
        	 int j=word.length()-1;
        	 for(int k=0;k<=word.length()-1;k++)
        	 {
        		 revWord=revWord+word.charAt(j);
        		 j--;
        	 }
        	 revSentence=revSentence+revWord+" ";
        }
        System.out.println("Original String is "+str);
        System.out.println("================================");
        System.out.println("Reversed String is "+revSentence);
       
        
       
    }
}
  