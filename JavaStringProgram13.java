//Java program to check whether two String objects contain the same data.//

package strings;
import java.util.Scanner;

public class JavaStringProgram13 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str1 = sc.nextLine();
		System.out.print("Enter another String : ");
		String str2 = sc.nextLine();
		boolean result = str1.equals(str2);
		if(result == true)
			System.out.println("Yes , both the strings contain the same data . ");
		else
			System.out.println("No , both the strings does not contain the same data . ");
		sc.close();
	}
}