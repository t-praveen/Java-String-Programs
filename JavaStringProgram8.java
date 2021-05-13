

package strings;
import java.util.Scanner;

public class JavaStringProgram8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		System.out.println("Enter a specified sequence of characters to check wether it is pesent in the string or not: ");
		String s = sc.nextLine();
		boolean result = str.contains(s);
		System.out.println(result);
		if(str.contains(s))
			System.out.println(str + " contains "+ s);
		else
			System.out.println(str + " doesn't contain "+ s);
		sc.close();
		
	}

}
