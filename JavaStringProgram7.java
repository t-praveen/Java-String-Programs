//ava program to concatenate a given string to the end of another string.//

package strings;
import java.util.Scanner;

public class JavaStringProgram7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String str1 = sc.nextLine();
		System.out.print("Enter second string : ");
		String str2 = sc.nextLine();
		String str3 = str1.concat(str2);
		System.out.println("After concatenating the 2 strings , the whole string is : "+ str3);
		sc.close();

	}

}
