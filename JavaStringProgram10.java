// Java program to compare a given string to the specified string buffer.//

package strings;
import java.util.Scanner;

public class JavaStringProgram10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		System.out.print("Enter another String : ");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Comparing "+str+" and "+sb+" : "+str.contentEquals(sb));
		System.out.println("Comparing "+s+" and "+sb+" : "+s.contentEquals(sb));
		sc.close();
	}

}
