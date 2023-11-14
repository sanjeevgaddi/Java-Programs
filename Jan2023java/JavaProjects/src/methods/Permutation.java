package methods;
import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();
        System.out.println("Permutations of the string are:");
        permute(str, 0, str.length() - 1);
    }

    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } 
        else {
            for (int i = left; i <= right; i++) 
            {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
