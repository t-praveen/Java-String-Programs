//Java program to compare a given string to the specified character sequence.//

package strings;
import java.util.Scanner;

public class JavaStringProgram9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		System.out.print("Enter a specified sequence of characters to compare it with the string : ");
		String s = sc.nextLine();
		boolean result = str.contentEquals(s);
		System.out.println(result);
		sc.close();
		
	}

}