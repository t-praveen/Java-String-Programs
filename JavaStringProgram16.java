//Java program to create a unique identifier of a given string.//

package strings;
import java.util.Scanner;
public class JavaStringProgram16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		int result = str.hashCode();
		System.out.println("The unique Identifier of the given string is : "+result);
		sc.close();
	}

}
