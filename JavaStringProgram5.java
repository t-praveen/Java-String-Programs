//Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.//

package strings;
import java.util.Scanner;

public class JavaStringProgram5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String str1 = sc.nextLine();
		System.out.print("Enter 2nd String : ");
		String str2 = sc.nextLine();
		int result = str1.compareTo(str2);
		if(result == 0)
	    {
	         System.out.println("\"" + str1 + "\"" + " is equal to " +"\"" + str2 + "\"");
	    }
	    else 
	    {
	         System.out.println("\"" + str1 + "\"" +" is not equal to " +"\"" + str2 + "\"");
	    }
		sc.close();
	}
}
