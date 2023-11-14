import java.util.Scanner;

class Demo39 {
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();
        
        char arr1[]=str.toCharArray();
        char arr2[]=new char[arr1.length];
        int j=arr2.length-1;
        for(int i=0;i<=arr1.length-1;i++)
        {
        	arr2[j]=arr1[i];
        	j--;
        }
        System.out.println("Enterd String is "+str);
        System.out.println("================================");
        String str2=new String(arr2);
        System.out.println("Reversed String is "+str2);
        System.out.println("================================");
        
        if(str.equals(str2))
        {
        	System.out.println("Enter String is Pallindrome");
        }
        else
        {
        	System.out.println("Enter String is not a Pallindrome");
        }
    }
}
  