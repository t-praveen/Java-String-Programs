//Java program to replace each substring of a given string that matches the given regular expression with the given replacement//

package strings;
import java.util.Scanner;

public class JavaStringProgram20 {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a String : ");
			String str = sc.nextLine();
			System.out.print("Enter a String to be replaced in the String : ");
			String newstr = sc.nextLine();
			System.out.print("Enter a new string to be replaced with the String you entered : ");
			String new_str = sc.nextLine();
			String result = str.replaceAll(newstr , new_str);
			System.out.println("After replacing , the new String is : "+result);
			sc.close();
		

	}

}
